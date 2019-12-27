package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Stack;

public class Window extends JFrame {
    Scanner scanner = new Scanner(System.in);
    Stack<Integer> deck1 = new Stack<Integer>();
    Stack<Integer> deck2 = new Stack<Integer>();
    boolean gameStarted = false;

    Font font = new Font("Times new roman", Font.PLAIN, 50);

    JTextArea label1 = new JTextArea("1\n2\n3\n4\n5");
    JTextArea label2 = new JTextArea("6\n7\n8\n9\n10");
    JButton button = new JButton("ssss");

    Window() {
        super("Window");
        setLayout(null);
        setSize(230, 300);

        button.setBounds(30, 10, 170, 50);
        label1.setBounds(10, 70, 100, 200);
        label2.setBounds(120, 70, 100, 200);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Next();
            }
        });

        label1.setAlignmentX(0);
        label2.setAlignmentX(0);

        add(label1);
        add(label2);
        add(button);

        setVisible(true);
    }


    public void Next() {
        if (!gameStarted) {//начало игры
            String[] strings1 = label1.getText().split("\n");
            String[] strings2 = label2.getText().split("\n");

            for (int i = strings1.length - 1; i >= 0; i--)
                deck1.push(Integer.parseInt(strings1[i]));

            for (int i = strings2.length - 1; i >= 0; i--)
                deck2.push(Integer.parseInt(strings2[i]));

            gameStarted = true;
        }

        if (!deck1.isEmpty() && !deck2.isEmpty()) {//процесс игры
            int x = deck1.pop();
            int y = deck2.pop();

            if ((x > y || (x == 0 && y == 9)) && !(x == 9 && y == 0)) {
                AddToBottom(deck2, new int[]{x, y});
            } else {
                AddToBottom(deck1, new int[]{x, y});
            }

            label1.setText(CollectionToString(deck1));
            label2.setText(CollectionToString(deck2));

        }

        //конец игры
        if (deck1.empty())
            label1.setText("Победа");
        else if (deck2.empty())
            label2.setText("Победа");

    }

    void AddToBottom(Stack<Integer> st, int[] add) {
        Stack<Integer> change = new Stack<Integer>();

        while (!st.empty())
            change.push(st.pop());

        for (int i = 0; i < add.length; i++)
            change.push(add[i]);

        while (!change.empty())
            st.push(change.pop());
    }

    String CollectionToString(Stack<Integer> st) {
        Stack<Integer> change = new Stack<Integer>();
        StringBuilder s = new StringBuilder();

        while (!st.empty()) {
            s.append(st.peek().toString());
            change.push(st.pop());
            if(!st.empty())
                s.append("\n");
        }
        while (!change.empty())
            st.push(change.pop());

        return s.toString();
    }


}
