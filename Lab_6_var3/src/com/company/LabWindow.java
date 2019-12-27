package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*Реализация программу на Java с JTextArea и двумя меню:
Цвет: который имеет возможность выбора из три возможных : синий,
красный и черный
Шрифт: тривида: “Times New Roman”, “MS Sans Serif”, “Courier
New”.Вы должны написать прогамму, которая с помощью меню,
может изменять шрифт и цвет текста, написанного в JTextArea*/

public class LabWindow extends JFrame {
    Font font = new Font("Courier", Font.ITALIC + Font.ROMAN_BASELINE, 20);

    JTextArea textArea = new JTextArea();

    JMenuItem FontButton1 = new JMenuItem("Times New Roman");
    JMenuItem FontButton2 = new JMenuItem("MS Sans Serif");
    JMenuItem FontButton3 = new JMenuItem("Courier New");

    JMenuItem ColButton1 = new JMenuItem("Black");
    JMenuItem ColButton2 = new JMenuItem("Red");
    JMenuItem ColButton3 = new JMenuItem("Blue");

    LabWindow() {
        super("Main Window");
        setLayout(null);
        setSize(600, 650);

        textArea.setFont(font);
        textArea.setBounds(50,50,500,500);
        add(textArea);

        JMenuBar Menu = new JMenuBar();
        JMenu Fonts = new JMenu("FONTS");
        JMenu Colors = new JMenu("COLORS");
        setJMenuBar(Menu);
        Menu.add(Fonts);
        Menu.add(Colors);

        Fonts.add(FontButton1);
        Fonts.add(FontButton2);
        Fonts.add(FontButton3);

        Colors.add(ColButton1);
        Colors.add(ColButton2);
        Colors.add(ColButton3);

        FontButton1.addActionListener(new Fonter(new Font("Times new roman", Font.PLAIN, 20)));
        FontButton2.addActionListener(new Fonter(new Font("MS sans serif", Font.PLAIN, 20)));
        FontButton3.addActionListener(new Fonter(new Font("Courier", Font.PLAIN, 20)));

        ColButton1.addActionListener(new Colorizer(Color.black));
        ColButton2.addActionListener(new Colorizer(Color.red));
        ColButton3.addActionListener(new Colorizer(Color.blue));








        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Colorizer implements ActionListener{
        Color color = Color.black;

        Colorizer(Color color){
            this.color = color;
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            textArea.setForeground(color);
        }
    }

    class Fonter implements ActionListener{
        Font font;
        Fonter(Font font){
            this.font = font;
        }
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            textArea.setFont(font);
        }
    }
}
