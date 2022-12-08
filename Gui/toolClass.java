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
import javax.swing.border.CompoundBorder;

public class toolClass{
    private JFrame frame1;

    public toolClass(JFrame frame1){
        this.frame1 = new JFrame();

        ImageIcon waterCan = new ImageIcon("waterCan.png");
        ImageIcon hoeTool = new ImageIcon("hoeTool.png");
        ImageIcon fertilTool = new ImageIcon("fertil.png");
        ImageIcon pickTool = new ImageIcon("pick.png");
        ImageIcon shovelTool = new ImageIcon("shovel.png");
    
        JButton pickaxeBtn = new JButton();
        pickaxeBtn.setIcon(pickTool);
        pickaxeBtn.setBackground(new Color(0xE3D308));
        pickaxeBtn.setContentAreaFilled(true);
        pickaxeBtn.setBorder(BorderFactory.createEmptyBorder());
        pickaxeBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton plowBtn = new JButton();
        plowBtn.setIcon(hoeTool);
        plowBtn.setBackground(new Color(0xE3D308));
        plowBtn.setContentAreaFilled(true);
        plowBtn.setBorder(BorderFactory.createEmptyBorder());
        plowBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton waterBtn = new JButton();
        waterBtn.setIcon(waterCan);
        waterBtn.setBackground(new Color(0xE3D308));
        waterBtn.setContentAreaFilled(true);
        waterBtn.setBorder(BorderFactory.createEmptyBorder());
        waterBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton fertilizerBtn = new JButton();
        fertilizerBtn.setIcon(fertilTool);
        fertilizerBtn.setBackground(new Color(0xE3D308));
        fertilizerBtn.setContentAreaFilled(true);
        fertilizerBtn.setBorder(BorderFactory.createEmptyBorder());
        fertilizerBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton shovelBtn = new JButton();
        shovelBtn.setIcon(shovelTool);
        shovelBtn.setBackground(new Color(0x36454F));
        shovelBtn.setContentAreaFilled(true);
        shovelBtn.setBorder(BorderFactory.createEmptyBorder());
        shovelBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JPanel toolPanel = new JPanel();
        toolPanel.setBackground(new Color(0x36454F));
        toolPanel.setBorder(new CompoundBorder(
            BorderFactory.createMatteBorder(4, 4, 4, 4, new Color(0xE3D308)),
            BorderFactory.createMatteBorder(3, 3, 3, 3, Color.white)
        ));
        toolPanel.setLayout(new GridLayout(5,1));

        toolPanel.add(pickaxeBtn);
        toolPanel.add(plowBtn);
        toolPanel.add(waterBtn);
        toolPanel.add(fertilizerBtn);
        toolPanel.add(shovelBtn);
        frame1.add(toolPanel, BorderLayout.EAST);
    }
}