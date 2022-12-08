import java.awt.BorderLayout;

import javax.swing.JFrame;

public class driver{
    public static void main(String[] args) {

        JFrame frame1 = new JFrame();
        frame1.setTitle("My Farming Adventures");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1000, 700);
        frame1.setResizable(false);
        frame1.setLayout(new BorderLayout());

        new Welcome(frame1);
        new toolClass(frame1);
        new seedClass(frame1);
        new lotClass(frame1);

        frame1.setVisible(true);

        
    }
}