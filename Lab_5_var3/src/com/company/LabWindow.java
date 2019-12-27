package com.company;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

public class LabWindow extends JFrame {
    int a = 0;
    JPanel imagePanel = new JPanel();
    String[] paths = new String[]{"/Users/mikhailkopotov/Desktop/OOP/Lab_5_var3/src/com/company/Spider_1.png",
            "/Users/mikhailkopotov/Desktop/OOP/Lab_5_var3/src/com/company/Spider_2.png"};//ВВЕСТИ

    LabWindow() {
        super("Example");
        setLayout(new FlowLayout());

        setSize(400, 400);

        add(imagePanel);

        TimerAction ta = new TimerAction();
        ta.window = this;
        Timer timer = new Timer(200, ta);
        timer.start();

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Anim(){
        a++;
        if(a == paths.length)
            a = 0;

        try{
            ImageIcon icon = new ImageIcon(paths[a]);
            imagePanel.removeAll();
            imagePanel.add(new JLabel(icon), BorderLayout.CENTER);
            add(imagePanel);
            revalidate();
            repaint();
        } catch (Exception ex) {
            System.out.println("Вы удалили необходимые файлы!");
        }
    }
}


