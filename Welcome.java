import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.lang.model.type.NullType;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
// import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class Welcome {
    private JFrame frame1;
    private String farmername;
    static JLabel objectCoinLabel;
    static JLabel farmerLevelLabel;
    static JLabel farmerTypeLabel;
    static JLabel dayLabel;

    /**
     * This contructors main allows the welcome class to connect to the main frame
     * and the necessary backend classes. In addition declare the necessary variables in the panel
     * @param frame1 This parameter is the main frame (allows the welcome class to connect to the main frame in the driver)
     * @param myfarm This parameter is a iteration of the MyFarm class
     * @param myfarmer This paremeter is the iteration of the Farmer class
     */
    public Welcome(JFrame frame1, MyFarm myfarm, Farmer myfarmer){
        this.frame1 = new JFrame();
        
        /*
         * Decleration of the different ImageIcon used for the labels and buttons
         */
        ImageIcon enterBtn = new ImageIcon("enterbtn.png");  
        ImageIcon upgradeBtn = new ImageIcon("upgrade.gif"); 
        ImageIcon nextBtn = new ImageIcon("nextbtn.png"); 
        ImageIcon coin = new ImageIcon("coin.gif");
        ImageIcon levelIcon = new ImageIcon("level.gif");
        ImageIcon dayIcon = new ImageIcon("day.png");
        ImageIcon fType = new ImageIcon("fType.png");
        ImageIcon registerIcon = new ImageIcon("register.gif");

        /*
         * Decleration of the farmer name as a JLabel
         */
        JLabel farmerNameLbl = new JLabel();
        farmerNameLbl.setForeground(Color.lightGray); //Text color
        farmerNameLbl.setFont(new Font("Clock", Font.PLAIN, 13));

        /*
         * Decleration of the register farmer label that 
         * indicates to register the farmer name
         */
        JLabel farmerNameLabel = new JLabel();
        farmerNameLabel.setIcon(registerIcon);
        farmerNameLabel.setText("Register Farmer: ");
        farmerNameLabel.setVerticalTextPosition(3);
        farmerNameLabel.setHorizontalTextPosition(0);
        farmerNameLabel.setForeground(Color.lightGray); //Text color
        farmerNameLabel.setFont(new Font("Clock", Font.PLAIN, 11));

        /*
         * Decleration of a JTextField allowing the user to type
         * the farmer's name
         */
        JTextField farmerNameText = new JTextField();
        farmerNameText.setColumns(7);

        /*
         * Decleration of enter name button allowing the user
         * to enter the name types in farmerNameText
         */
        JButton enterNameBtn = new JButton();
        enterNameBtn.setIcon(enterBtn);
        enterNameBtn.setBackground(new Color(0xE3D308));
        enterNameBtn.setContentAreaFilled(true);
        enterNameBtn.setBorder(BorderFactory.createEmptyBorder());
        enterNameBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                farmername = farmerNameText.getText();
                farmerNameLbl.setText("Hello " + farmername + "!");
                farmerNameText.setVisible(false);
                enterNameBtn.setVisible(false);
            }
        });
        myfarmer.setName(farmername);

        /*
         * Decleration of the Object Coin Label
         */
        objectCoinLabel = new JLabel();
        objectCoinLabel.setIcon(coin);
        objectCoinLabel.setText(String.valueOf(myfarmer.getObjectCoin()));
        objectCoinLabel.setVerticalTextPosition(3);
        objectCoinLabel.setHorizontalTextPosition(0);
        objectCoinLabel.setForeground(Color.lightGray); //Text color
        objectCoinLabel.setFont(new Font("Clock", Font.PLAIN, 13));

        /*
         * Decleration of the farmer level Label
         */
        farmerLevelLabel = new JLabel();
        farmerLevelLabel.setIcon(levelIcon);
        farmerLevelLabel.setText("Farmer Level: " + myfarmer.getLevel());
        farmerLevelLabel.setVerticalTextPosition(3);
        farmerLevelLabel.setHorizontalTextPosition(0);
        farmerLevelLabel.setForeground(Color.lightGray); //Text color
        farmerLevelLabel.setFont(new Font("Clock", Font.PLAIN, 11));

        /*
         * Decleration of the farmer type Label
         */
        farmerTypeLabel = new JLabel();
        farmerTypeLabel.setIcon(fType);
        farmerTypeLabel.setText("Farmer Type: " + myfarmer.getType().getName());
        farmerTypeLabel.setVerticalTextPosition(3);
        farmerTypeLabel.setHorizontalTextPosition(0);
        farmerTypeLabel.setForeground(Color.lightGray); //Text color
        farmerTypeLabel.setFont(new Font("Clock", Font.PLAIN, 11));

        /*
         * Decleration of the upgrade farmer type button depending 
         * on farmers level
         */
        JButton upgradeLevelBtn = new JButton();
        upgradeLevelBtn.setIcon(upgradeBtn);
        upgradeLevelBtn.setBackground(new Color(0xE3D308));
        upgradeLevelBtn.setContentAreaFilled(true);
        upgradeLevelBtn.setBorder(BorderFactory.createEmptyBorder());
        upgradeLevelBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(myfarmer.checkRegFarmer())
                {
                    myfarmer.upgradeFarmer(myfarm.getFarmerTypes());
                    updateData(myfarm, myfarmer);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Cannot Upgrade Farmer Type", null, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        /*
         * Decleration of the label indicating what day it is
         */
        dayLabel = new JLabel();
        dayLabel.setIcon(dayIcon);
        dayLabel.setText("Day: " + myfarm.getTotalDays());
        dayLabel.setVerticalTextPosition(3);
        dayLabel.setHorizontalTextPosition(0);
        dayLabel.setForeground(Color.lightGray); //Text color
        dayLabel.setFont(new Font("Clock", Font.PLAIN, 11));

        /*
         * Decleration of the Button allowing to go to the next day
         */
        JButton nextDayBtn = new JButton();
        nextDayBtn.setIcon(nextBtn);
        nextDayBtn.setBackground(new Color(0xE3D308));
        nextDayBtn.setContentAreaFilled(true);
        nextDayBtn.setBorder(BorderFactory.createEmptyBorder());
        nextDayBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                myfarm.NewDay();
                updateData(myfarm, myfarmer);
                lotClass.Updatebutton(myfarm);
            }
        });

        /*
         * Decleration of the welcome panel including all previous stated buttons and labels
         */
        JPanel welcomePanel = new JPanel();
        welcomePanel.setBackground(new Color(0x36454F));
        welcomePanel.setBorder(new CompoundBorder(
            BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(0xE3D308)),
            BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white)
        ));
        welcomePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        welcomePanel.add(farmerNameLabel);
        welcomePanel.add(farmerNameText);
        welcomePanel.add(farmerNameLbl);
        welcomePanel.add(enterNameBtn);
        welcomePanel.add(objectCoinLabel);
        welcomePanel.add(farmerLevelLabel);
        welcomePanel.add(farmerTypeLabel);
        welcomePanel.add(upgradeLevelBtn);
        welcomePanel.add(dayLabel);
        welcomePanel.add(nextDayBtn);

        frame1.add(welcomePanel, BorderLayout.NORTH);
    }

    /**
     * updateData method is where the different labels are updated depending
     * on the stats of the player
     * @param myfarm This parameter is a iteration of the MyFarm class
     * @param myfarmer This paremeter is the iteration of the Farmer class
     */
    public static void updateData(MyFarm myfarm, Farmer myfarmer)
    {
        objectCoinLabel.setText(String.valueOf(myfarmer.getObjectCoin()));
        farmerLevelLabel.setText("Farmer Level: " + myfarmer.getLevel());
        farmerTypeLabel.setText("Farmer Type: " + myfarmer.getType().getName());
        dayLabel.setText("Day: " + myfarm.getTotalDays());

        if((myfarm.getActiveCrops() == 0 && myfarmer.getObjectCoin() < 5) || myfarm.getWitheredCrops() >= 50)
        {
            JOptionPane.showMessageDialog(null, "End Game", null, JOptionPane.WARNING_MESSAGE);

        }
    }
} 
