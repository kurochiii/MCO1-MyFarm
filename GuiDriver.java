import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

public class GuiDriver{ 
    public static void main(String[] args) {

        JFrame sFrame = new JFrame();
        sFrame.setTitle("Start Game");
        sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sFrame.setSize(300, 200);
        sFrame.setResizable(false); 
        sFrame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 40));
        sFrame.getContentPane().setBackground(new Color(0x36454F));

        ImageIcon newgame = new ImageIcon("Start.png");
        ImageIcon exitgame = new ImageIcon("Exit.png");

        JButton startBtn = new JButton();
        startBtn.setIcon(newgame);
        startBtn.setBackground(new Color(0x36454F));
        startBtn.setContentAreaFilled(true);
        startBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                sFrame.setVisible(false);

                JFrame frame1 = new JFrame();
                frame1.setTitle("My Farming Adventures");
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setSize(1050, 700);
                frame1.setResizable(false);
                frame1.setLayout(new BorderLayout());

                NewGame(frame1);

                frame1.setVisible(true); 
            }
        });

        JButton exitBtn = new JButton();
        exitBtn.setIcon(exitgame);
        exitBtn.setBackground(new Color(0x36454F));
        exitBtn.setContentAreaFilled(true);
        exitBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });

        sFrame.add(startBtn);
        sFrame.add(exitBtn);

        sFrame.setVisible(true);
    }  

    public static void NewGame(JFrame frame1)
    {
        MyFarm myfarm = new MyFarm();
        myfarm.setGame();
        Farmer myfarmer = new Farmer(myfarm.getFarmerTypes());
        myfarm.setFarmer(myfarmer);
        int [] SelectedLot = new int[2];

        new Welcome(frame1, myfarm, myfarmer);
        new toolClass(frame1, myfarm, myfarmer, SelectedLot);
        new seedClass(frame1, myfarm, myfarmer, SelectedLot);
        new lotClass(frame1, myfarm, SelectedLot);

        lotClass.Updatebutton(myfarm);
        Welcome.updateData(myfarm, myfarmer);
    }
}
