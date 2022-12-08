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
// import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class seedClass{
    private JFrame frame1;

    public seedClass(JFrame frame1){
        this.frame1 = new JFrame();

        ImageIcon turnipPlant = new ImageIcon("turnip.png");
        ImageIcon carrotPlant = new ImageIcon("carrot.png");
        ImageIcon potatoPlant = new ImageIcon("potato.png");
        ImageIcon roseflower = new ImageIcon("rose.png");
        ImageIcon tulipflower = new ImageIcon("tulip.png");
        ImageIcon sunflower = new ImageIcon("sunflower.png");
        ImageIcon mangoTree = new ImageIcon("mango.png");
        ImageIcon appleTree = new ImageIcon("apple.png");

        JButton turnipBtn = new JButton();
        turnipBtn.setIcon(turnipPlant);
        turnipBtn.setBackground(new Color(0xE3D308));
        turnipBtn.setContentAreaFilled(true);
        turnipBtn.setBorder(BorderFactory.createEmptyBorder());
        turnipBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton carrotBtn = new JButton();
        carrotBtn.setIcon(carrotPlant);
        carrotBtn.setBackground(new Color(0xE3D308));
        carrotBtn.setContentAreaFilled(true);
        carrotBtn.setBorder(BorderFactory.createEmptyBorder());
        carrotBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton potatoBtn = new JButton();
        potatoBtn.setIcon(potatoPlant);
        potatoBtn.setBackground(new Color(0xE3D308));
        potatoBtn.setContentAreaFilled(true);
        potatoBtn.setBorder(BorderFactory.createEmptyBorder());
        potatoBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton roseBtn = new JButton();
        roseBtn.setIcon(roseflower);
        roseBtn.setBackground(new Color(0xE3D308));
        roseBtn.setContentAreaFilled(true);
        roseBtn.setBorder(BorderFactory.createEmptyBorder());
        roseBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton tulipsBtn = new JButton();
        tulipsBtn.setIcon(tulipflower);
        tulipsBtn.setBackground(new Color(0xE3D308));
        tulipsBtn.setContentAreaFilled(true);
        tulipsBtn.setBorder(BorderFactory.createEmptyBorder());
        tulipsBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton sunflowerBtn = new JButton();
        sunflowerBtn.setIcon(sunflower);
        sunflowerBtn.setBackground(new Color(0xE3D308));
        sunflowerBtn.setContentAreaFilled(true);
        sunflowerBtn.setBorder(BorderFactory.createEmptyBorder());
        sunflowerBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton mangoBtn = new JButton();
        mangoBtn.setIcon(mangoTree);
        mangoBtn.setBackground(new Color(0xE3D308));
        mangoBtn.setContentAreaFilled(true);
        mangoBtn.setBorder(BorderFactory.createEmptyBorder());
        mangoBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

        JButton appleBtn = new JButton();
        appleBtn.setIcon(appleTree);
        appleBtn.setBackground(new Color(0xE3D308));
        appleBtn.setContentAreaFilled(true);
        appleBtn.setBorder(BorderFactory.createEmptyBorder());
        appleBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){

            }
        });

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

        frame1.add(seedPanel, BorderLayout.SOUTH);

    }
}