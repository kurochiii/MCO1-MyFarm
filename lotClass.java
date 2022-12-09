import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
// import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class lotClass{
    private JFrame frame1;
    static JButton lotBtn[][] = new JButton[5][10];
    static ImageIcon pGrass;
    static ImageIcon nGrass;
    static ImageIcon unplowed;
    static ImageIcon rocks;
    static ImageIcon wPlant;
    static ImageIcon gPlant;

    public lotClass(JFrame frame1, MyFarm myfarm, int[] SelectedLot){
        this.frame1 = new JFrame();

        JPanel lotPanel = new JPanel();

        pGrass = new ImageIcon("pGrass.png");
        nGrass = new ImageIcon("nGrass.png");
        unplowed = new ImageIcon("unplowed.png");
        rocks = new ImageIcon("rocks.png");
        wPlant = new ImageIcon("Wplant.png");
        gPlant = new ImageIcon("Gplant.png");

        lotPanel.setBackground(new Color(0x36454F));
        lotPanel.setBorder(new CompoundBorder(
            BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(0xE3D308)),
            BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white)
        ));
        lotPanel.setLayout(new GridLayout(5, 10));

        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    for (int i = 0; i < 5; i++)
                    {
                        for(int j = 0; j < 10; j++)
                        {
                            if(lotBtn[i][j] == e.getSource())
                            {
                                SelectedLot[0] = i; 
                                SelectedLot[1] = j;
                            }
                        }
                    }
                }
            }
        };
          
        // lotPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                lotBtn[i][j] = new JButton();
                lotBtn[i][j].addActionListener(listener);
                if(myfarm.getFarm()[i][j].getRock())
                {
                    lotBtn[i][j].setIcon(rocks);
                }
                else 
                {
                    lotBtn[i][j].setIcon(unplowed);
                }
                lotBtn[i][j].setBackground(new Color(0xe7cda3));
                lotBtn[i][j].setContentAreaFilled(true);
                lotBtn[i][j].setBorder(BorderFactory.createEmptyBorder());
                lotPanel.add(lotBtn[i][j]);
            }
        }

        frame1.add(lotPanel, BorderLayout.CENTER);
    }

    public static void Updatebutton(MyFarm myfarm)
    {
        for (int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(myfarm.getFarm()[i][j].getPlowed())
                {
                    lotBtn[i][j].setIcon(nGrass);
                }
                if(myfarm.getFarm()[i][j].getPlowed() == true && myfarm.getFarm()[i][j].getCrop() instanceof Crop)
                {
                    if(myfarm.getFarm()[i][j].getCrop().CheckStatus() == 0)
                    {
                        lotBtn[i][j].setIcon(gPlant);
                    }
                    else if(myfarm.getFarm()[i][j].getCrop().CheckStatus() == 1)
                    {
                        lotBtn[i][j].setIcon(pGrass);
                    }
                    else if(myfarm.getFarm()[i][j].getCrop().CheckStatus() == 2)
                    {
                        lotBtn[i][j].setIcon(wPlant);
                    }
                    
                }
                if(myfarm.getFarm()[i][j].getPlowed() == false && myfarm.getFarm()[i][j].getRock() == false)
                {
                    lotBtn[i][j].setIcon(unplowed);
                }
                if(myfarm.getFarm()[i][j].getRock())
                {
                    lotBtn[i][j].setIcon(rocks);
                }
            }
        }
    }
}