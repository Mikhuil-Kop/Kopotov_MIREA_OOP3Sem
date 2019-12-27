package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerAction implements ActionListener {
    public LabWindow window;
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        window.Anim();
    }
}