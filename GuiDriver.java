import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class GuiDriver {
    
    /** 
     * The main method allows the program to run the GUI or in other words display the program
     * @param args is a String array needed to run the program
     */
    public static void main(String[] args) {

        boolean exit = false;
       
        JFrame frame1 = new JFrame();
        frame1.setTitle("My Farming Adventures");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(1050, 700);
        frame1.setResizable(false);
        frame1.setLayout(new BorderLayout());
        
        MyFarm myfarm = new MyFarm();
        myfarm.setGame();
        Farmer myfarmer = new Farmer(myfarm.getFarmerTypes());
        int [] SelectedLot = new int[2];

        new Welcome(frame1, myfarm, myfarmer);
        new toolClass(frame1, myfarm, myfarmer, SelectedLot);
        new seedClass(frame1, myfarm, myfarmer, SelectedLot);
        new lotClass(frame1, myfarm, SelectedLot);

        frame1.setVisible(true);

    }   
}
