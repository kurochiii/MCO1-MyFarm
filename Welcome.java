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
    String farmername;
    static JLabel objectCoinLabel;
    static JLabel farmerLevelLabel;
    static JLabel farmerTypeLabel;
    static JLabel dayLabel;

    public Welcome(JFrame frame1, MyFarm myfarm, Farmer myfarmer){
        this.frame1 = new JFrame();

        ImageIcon enterBtn = new ImageIcon("enterbtn.png");  
        ImageIcon upgradeBtn = new ImageIcon("upgrade.gif"); 
        ImageIcon nextBtn = new ImageIcon("nextbtn.png"); 
        ImageIcon coin = new ImageIcon("coin.gif");
        ImageIcon levelIcon = new ImageIcon("level.gif");
        ImageIcon dayIcon = new ImageIcon("day.png");
        ImageIcon fType = new ImageIcon("fType.png");
        ImageIcon registerIcon = new ImageIcon("register.gif");

        JLabel farmerNameLbl = new JLabel();
        farmerNameLbl.setForeground(Color.lightGray); //Text color
        farmerNameLbl.setFont(new Font("Clock", Font.PLAIN, 13));

        JLabel farmerNameLabel = new JLabel();
        farmerNameLabel.setIcon(registerIcon);
        farmerNameLabel.setText("Register Farmer: ");
        farmerNameLabel.setVerticalTextPosition(3);
        farmerNameLabel.setHorizontalTextPosition(0);
        farmerNameLabel.setForeground(Color.lightGray); //Text color
        farmerNameLabel.setFont(new Font("Clock", Font.PLAIN, 11));

        JTextField farmerNameText = new JTextField();
        farmerNameText.setColumns(7);

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

        objectCoinLabel = new JLabel();
        objectCoinLabel.setIcon(coin);
        objectCoinLabel.setText(String.valueOf(myfarmer.getObjectCoin()));
        objectCoinLabel.setVerticalTextPosition(3);
        objectCoinLabel.setHorizontalTextPosition(0);
        objectCoinLabel.setForeground(Color.lightGray); //Text color
        objectCoinLabel.setFont(new Font("Clock", Font.PLAIN, 13));

        farmerLevelLabel = new JLabel();
        farmerLevelLabel.setIcon(levelIcon);
        farmerLevelLabel.setText("Farmer Level: " + myfarmer.getLevel());
        farmerLevelLabel.setVerticalTextPosition(3);
        farmerLevelLabel.setHorizontalTextPosition(0);
        farmerLevelLabel.setForeground(Color.lightGray); //Text color
        farmerLevelLabel.setFont(new Font("Clock", Font.PLAIN, 11));

        farmerTypeLabel = new JLabel();
        farmerTypeLabel.setIcon(fType);
        farmerTypeLabel.setText("Farmer Type: " + myfarmer.getType().getName());
        farmerTypeLabel.setVerticalTextPosition(3);
        farmerTypeLabel.setHorizontalTextPosition(0);
        farmerTypeLabel.setForeground(Color.lightGray); //Text color
        farmerTypeLabel.setFont(new Font("Clock", Font.PLAIN, 11));

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

        dayLabel = new JLabel();
        dayLabel.setIcon(dayIcon);
        dayLabel.setText("Day: " + myfarm.getTotalDays());
        dayLabel.setVerticalTextPosition(3);
        dayLabel.setHorizontalTextPosition(0);
        dayLabel.setForeground(Color.lightGray); //Text color
        dayLabel.setFont(new Font("Clock", Font.PLAIN, 11));

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

    public static void updateData(MyFarm myfarm, Farmer myfarmer)
    {
        objectCoinLabel.setText(String.valueOf(myfarmer.getObjectCoin()));
        farmerLevelLabel.setText("Farmer Level: " + myfarmer.getLevel());
        farmerTypeLabel.setText("Farmer Type: " + myfarmer.getType().getName());
        dayLabel.setText("Day: " + myfarm.getTotalDays());
    }
} 
