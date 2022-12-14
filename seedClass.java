import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.CompoundBorder;

public class seedClass{
    private JFrame frame1;
    private static JButton harvestBtn;
    private static JButton infoBtn;

    /**
     * This Constructor sets the needed attributes for the Seed Class
     * to connect to the main frame and connecting classes
     * @param frame1 This parameter is the iteration of the JFrame to connect to the main frame
     * @param myfarm This parameter is the iteration of the MyFarm class
     * @param myfarmer This parameter is the iteration of Farmer class
     * @param SelectedLot This parameter is an interger array to indicate selected lot
     */
    public seedClass(JFrame frame1, MyFarm myfarm, Farmer myfarmer, int[] SelectedLot){
        this.frame1 = new JFrame();

        /*
         * Decleration of the different ImageIcon used for the buttons
         */
        ImageIcon turnipPlant = new ImageIcon("turnip.png");
        ImageIcon carrotPlant = new ImageIcon("carrot.png");
        ImageIcon potatoPlant = new ImageIcon("potato.png");
        ImageIcon roseflower = new ImageIcon("rose.png");
        ImageIcon tulipflower = new ImageIcon("tulip.png");
        ImageIcon sunflower = new ImageIcon("sunflower.png");
        ImageIcon mangoTree = new ImageIcon("mango.png");
        ImageIcon appleTree = new ImageIcon("apple.png");
        ImageIcon harvestButton = new ImageIcon("harvest.gif");
        ImageIcon InfoButton = new ImageIcon("info.png");

        /*
         * Decleration of the turnip button which allows user to plant turnips
         */
        JButton turnipBtn = new JButton();
        turnipBtn.setIcon(turnipPlant);
        turnipBtn.setBackground(new Color(0xE3D308));
        turnipBtn.setContentAreaFilled(true);
        turnipBtn.setBorder(BorderFactory.createEmptyBorder());
        turnipBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false)
                    {
                        if (myfarmer.plantCrop(0, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                        {
                            Welcome.updateData(myfarm, myfarmer);
                            lotClass.Updatebutton(myfarm);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of the carrot button which allows user to plant carrots
         */
        JButton carrotBtn = new JButton();
        carrotBtn.setIcon(carrotPlant);
        carrotBtn.setBackground(new Color(0xE3D308));
        carrotBtn.setContentAreaFilled(true);
        carrotBtn.setBorder(BorderFactory.createEmptyBorder());
        carrotBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false)
                    {
                        if (myfarmer.plantCrop(1, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                        {
                            Welcome.updateData(myfarm, myfarmer);
                            lotClass.Updatebutton(myfarm);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of the potato button which allows user to plant potatos
         */
        JButton potatoBtn = new JButton();
        potatoBtn.setIcon(potatoPlant);
        potatoBtn.setBackground(new Color(0xE3D308));
        potatoBtn.setContentAreaFilled(true);
        potatoBtn.setBorder(BorderFactory.createEmptyBorder());
        potatoBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false)
                    {
                        if (myfarmer.plantCrop(2, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                        {
                            Welcome.updateData(myfarm, myfarmer);
                            lotClass.Updatebutton(myfarm);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of the rose button which allows user to plant roses
         */
        JButton roseBtn = new JButton();
        roseBtn.setIcon(roseflower);
        roseBtn.setBackground(new Color(0xE3D308));
        roseBtn.setContentAreaFilled(true);
        roseBtn.setBorder(BorderFactory.createEmptyBorder());
        roseBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false)
                    {
                        if (myfarmer.plantCrop(3, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                        {
                            Welcome.updateData(myfarm, myfarmer);
                            lotClass.Updatebutton(myfarm);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of the tulip button which allows user to plant tulips
         */
        JButton tulipsBtn = new JButton();
        tulipsBtn.setIcon(tulipflower);
        tulipsBtn.setBackground(new Color(0xE3D308));
        tulipsBtn.setContentAreaFilled(true);
        tulipsBtn.setBorder(BorderFactory.createEmptyBorder());
        tulipsBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false)
                    {
                        if (myfarmer.plantCrop(4, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                        {
                            Welcome.updateData(myfarm, myfarmer);
                            lotClass.Updatebutton(myfarm);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of sunflower button that allows user to plant sunflowers
         */
        JButton sunflowerBtn = new JButton();
        sunflowerBtn.setIcon(sunflower);
        sunflowerBtn.setBackground(new Color(0xE3D308));
        sunflowerBtn.setContentAreaFilled(true);
        sunflowerBtn.setBorder(BorderFactory.createEmptyBorder());
        sunflowerBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false)
                    {
                        if (myfarmer.plantCrop(5, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                        {
                            Welcome.updateData(myfarm, myfarmer);
                            lotClass.Updatebutton(myfarm);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of the mango button which allows user to plant mango trees
         */
        JButton mangoBtn = new JButton();
        mangoBtn.setIcon(mangoTree);
        mangoBtn.setBackground(new Color(0xE3D308));
        mangoBtn.setContentAreaFilled(true);
        mangoBtn.setBorder(BorderFactory.createEmptyBorder());
        mangoBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false
                        )
                    {
                        if (SelectedLot[0]!= 0 && SelectedLot[0]!= 4 && SelectedLot[1]!= 0 && SelectedLot[1]!= 9)
                        {
                            if (myfarm.getFarm()[SelectedLot[0] - 1][SelectedLot[1] - 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0]][SelectedLot[1] - 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] + 1][SelectedLot[1] - 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] - 1][SelectedLot[1]].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] + 1][SelectedLot[1]].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] - 1][SelectedLot[1] + 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0]][SelectedLot[1] + 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] + 1][SelectedLot[1]+ 1].getCrop() == null)
                            {
                                if (myfarmer.plantCrop(6, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                                {
                                    Welcome.updateData(myfarm, myfarmer);
                                    lotClass.Updatebutton(myfarm);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of the apple button which allows user to plant apple trees
         */
        JButton appleBtn = new JButton();
        appleBtn.setIcon(appleTree);
        appleBtn.setBackground(new Color(0xE3D308));
        appleBtn.setContentAreaFilled(true);
        appleBtn.setBorder(BorderFactory.createEmptyBorder());
        appleBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(SelectedLot[0] == 99 && SelectedLot[1] == 99)
                {
                    JOptionPane.showMessageDialog(null, "Select a Lot", null, JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getPlowed() == true &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop() == null &&
                        myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getRock() == false
                        )
                    {
                        if (SelectedLot[0]!= 0 && SelectedLot[0]!= 4 && SelectedLot[1]!= 0 && SelectedLot[1]!= 9)
                        {
                            if (myfarm.getFarm()[SelectedLot[0] - 1][SelectedLot[1] - 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0]][SelectedLot[1] - 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] + 1][SelectedLot[1] - 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] - 1][SelectedLot[1]].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] + 1][SelectedLot[1]].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] - 1][SelectedLot[1] + 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0]][SelectedLot[1] + 1].getCrop() == null &&
                                myfarm.getFarm()[SelectedLot[0] + 1][SelectedLot[1]+ 1].getCrop() == null)
                            {
                                if (myfarmer.plantCrop(7, myfarm.getSeedList(), myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                                {
                                    Welcome.updateData(myfarm, myfarmer);
                                    lotClass.Updatebutton(myfarm);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null, "Not enough money", null, JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Unable to Plant Crop", null, JOptionPane.INFORMATION_MESSAGE);
                    }
                    SelectedLot[0] = 99; 
                    SelectedLot[1] = 99;
                }
            }
        });

        /*
         * Decleration of harvest button allowing to harvest crops that are fully grown
         */
        harvestBtn = new JButton();
        harvestBtn.setIcon(harvestButton);
        harvestBtn.setBackground(new Color(0xE3D308));
        harvestBtn.setContentAreaFilled(true);
        harvestBtn.setBorder(BorderFactory.createEmptyBorder());
        harvestBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (myfarmer.harvestCrop(myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]]))
                {
                    JOptionPane.showMessageDialog(null, "Results of Harvest \n" +  "Harvested " + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getProducts() + " " + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getName() + "\nObjectCoin Earned: " + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getFinalHarvestPrice(), 
                                            null, JOptionPane.INFORMATION_MESSAGE);
                    myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].RemoveCrop();
                    Welcome.updateData(myfarm, myfarmer);
                    lotClass.Updatebutton(myfarm);
                    seedClass.update();
                }
            }
        });

        /*
         * Decleration of info button which displays the info of the specific crop selected
         */
        infoBtn = new JButton();
        infoBtn.setIcon(InfoButton);
        infoBtn.setBackground(new Color(0xE3D308));
        infoBtn.setContentAreaFilled(true);
        infoBtn.setBorder(BorderFactory.createEmptyBorder());
        infoBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JOptionPane.showMessageDialog(null, "Plant Status \n" + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getName() + "\n# of Times Watered:  " + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getTimesWatered() + "\n# of Times Fertilized: " + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getTimesFertilized() + "\nDays old: " + myfarm.getFarm()[SelectedLot[0]][SelectedLot[1]].getCrop().getPlantedDays(), 
                                            null, JOptionPane.INFORMATION_MESSAGE);
                seedClass.update();
            }
        });

        /*
         * Decleration of seed panel which contains all labels and buttons previously stated
         */
        JPanel seedPanel = new JPanel();
        seedPanel.setBackground(new Color(0x36454F));
        seedPanel.setBorder(new CompoundBorder(
            BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(0xE3D308)),
            BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white)
        ));
        seedPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));

        seedPanel.add(turnipBtn);
        seedPanel.add(carrotBtn);
        seedPanel.add(potatoBtn);
        seedPanel.add(roseBtn);
        seedPanel.add(tulipsBtn);
        seedPanel.add(sunflowerBtn);
        seedPanel.add(mangoBtn);
        seedPanel.add(appleBtn);
        seedPanel.add(harvestBtn);
        seedPanel.add(infoBtn);

        frame1.add(seedPanel, BorderLayout.SOUTH);

        update();
    }

    /**
     * updateHarvest method indicates to show the harvest button and hide the info button
     */
    public static void updateHarvest()
    {
        harvestBtn.setVisible(true);
        infoBtn.setVisible(false);
    }

    /**
     * updateInfo method indicates to show the info button and hide the harvest button
     */
    public static void updateInfo()
    {
        harvestBtn.setVisible(false);
        infoBtn.setVisible(true);
    }

    /**
     * update method indicates to hide both harvest and info buttons
     */
    public static void update()
    {
        harvestBtn.setVisible(false);
        infoBtn.setVisible(false);
    }

}