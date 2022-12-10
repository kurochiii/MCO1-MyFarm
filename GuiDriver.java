import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;

public class GuiDriver {
    
    /** 
     * The main method allows the program to run the GUI or in other words display the program
     * @param args is a String array needed to run the program
     */
    public static void main(String[] args) {

        JFrame sFrame = new JFrame();
        sFrame.setTitle("Start Game");
        sFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sFrame.setSize(500, 500);
        sFrame.setResizable(false);
        sFrame.setLayout(new FlowLayout());

        ImageIcon newgame = new ImageIcon("shovel.png");
        ImageIcon exitgame = new ImageIcon("potato.png");
        ImageIcon tryagain = new ImageIcon("mango.png");

        JButton startBtn = new JButton();
        startBtn.setIcon(newgame);
        startBtn.setBackground(new Color(0xE3D308));
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

                MyFarm myfarm = new MyFarm();
                myfarm.setGame();
                Farmer myfarmer = new Farmer(myfarm.getFarmerTypes());
                myfarm.setFarmer(myfarmer);
                int [] SelectedLot = new int[2];

                new Welcome(frame1, myfarm, myfarmer);
                new toolClass(frame1, myfarm, myfarmer, SelectedLot);
                new seedClass(frame1, myfarm, myfarmer, SelectedLot);
                new lotClass(frame1, myfarm, SelectedLot);

                frame1.setVisible(true); 

                Boolean endGame = false;
                
                while(endGame == false)
                {
                    //JOptionPane.showMessageDialog(null, "Check", null, JOptionPane.INFORMATION_MESSAGE);
                    if(myfarm.checkEndGame() == true)
                    {
                        JOptionPane.showMessageDialog(null, "End Game", null, JOptionPane.INFORMATION_MESSAGE);
                        sFrame.setTitle("End Game");
                        sFrame.setVisible(true);
                        endGame = true;
                    }
                }
            }
        });

        JButton exitBtn = new JButton();
        exitBtn.setIcon(exitgame);
        exitBtn.setBackground(new Color(0xE3D308));
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

    public static void NewFarm(JFrame frame1, MyFarm myfarm, Farmer myfarmer)
    {
        frame1.setTitle("My Farming Adventures");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1050, 700);
        frame1.setResizable(false);
        frame1.setLayout(new BorderLayout());
    
        myfarm.setGame();
        int [] SelectedLot = new int[2];

        new Welcome(frame1, myfarm, myfarmer);
        new toolClass(frame1, myfarm, myfarmer, SelectedLot);
        new seedClass(frame1, myfarm, myfarmer, SelectedLot);
        new lotClass(frame1, myfarm, SelectedLot);
    }
}
