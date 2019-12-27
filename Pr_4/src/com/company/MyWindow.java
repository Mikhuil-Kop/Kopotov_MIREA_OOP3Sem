package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    private JButton MilanButton = new JButton("Милан забивает");
    private JButton MadridButton = new JButton("Мадрид забивает");
    private JLabel ResultLabel = new JLabel("Счёт 0 / 0");
    private JLabel LastScoreLabel = new JLabel("Last scorer: N/A");
    private JLabel WinnerLabel = new JLabel("Winner: DRAW");
    private int milanScore = 0;
    private int madridScore = 0;

    private void changeWinner() {
        if (milanScore > madridScore) {
            WinnerLabel.setText("Победитель: Милан");
        } else if (milanScore == madridScore)
            WinnerLabel.setText("Победитель: Ничья");
        else {
            WinnerLabel.setText("Победитель: Мадрид");
        }
    }

    MyWindow() {
        super("Yes");
        super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(550, 300);
        add(MilanButton);
        add(MadridButton);
        add(ResultLabel);
        add(LastScoreLabel);
        add(WinnerLabel);
        MilanButton.setBounds(100, 55, 150, 30);
        MadridButton.setBounds(300, 55, 150, 30);
        ResultLabel.setBounds(100, 90, 150, 50);
        LastScoreLabel.setBounds(100, 120, 300, 50);
        WinnerLabel.setBounds(100, 150, 300, 50);

        MilanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore += 1;
                ResultLabel.setText("Счёт: " + milanScore + " / " + madridScore);
                LastScoreLabel.setText("Последний гол: Милан");
                changeWinner();
            }
        });

        MadridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore += 1;
                ResultLabel.setText("Счёт: " + milanScore + " / " + madridScore);
                LastScoreLabel.setText("Последний гол: Мадрид");
                changeWinner();
            }
        });

        setVisible(true);
    }

}
