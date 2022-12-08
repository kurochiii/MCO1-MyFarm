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
// import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class lotClass{
    private JFrame frame1;

    public lotClass(JFrame frame1){
        this.frame1 = new JFrame();

        JPanel lotPanel = new JPanel();

        ImageIcon pGrass = new ImageIcon("pGrass.png");
        ImageIcon nGrass = new ImageIcon("nGrass.png");
        ImageIcon unplowed = new ImageIcon("unplowed.png");
        ImageIcon rocks = new ImageIcon("rocks.png");

        lotPanel.setBackground(new Color(0x36454F));
        lotPanel.setBorder(new CompoundBorder(
            BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(0xE3D308)),
            BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white)
        ));
        lotPanel.setLayout(new GridLayout(5, 10));

        JButton lotBtn[][] = new JButton[5][10];
          
        // lotPanel.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                lotBtn[i][j] = new JButton();
                lotBtn[i][j].setIcon(pGrass);
                lotBtn[i][j].setBackground(new Color(0xe7cda3));
                lotBtn[i][j].setContentAreaFilled(true);
                lotBtn[i][j].setBorder(BorderFactory.createEmptyBorder());
                lotPanel.add(lotBtn[i][j]);
            }
        }

        lotBtn[2][2].setIcon(nGrass);
        lotBtn[4][5].setIcon(nGrass);
        lotBtn[3][1].setIcon(nGrass);
        lotBtn[1][9].setIcon(nGrass);

        lotBtn[4][1].setIcon(unplowed);
        lotBtn[3][8].setIcon(unplowed);
        lotBtn[1][7].setIcon(unplowed);
        lotBtn[1][3].setIcon(unplowed);

        lotBtn[3][2].setIcon(rocks);
        lotBtn[2][1].setIcon(rocks);
        lotBtn[1][3].setIcon(rocks);

        frame1.add(lotPanel, BorderLayout.CENTER);
    }
}