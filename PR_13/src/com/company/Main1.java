package com.company;

import com.sun.source.tree.CompilationUnitTree;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main1 {
    public static void main(String[] args) {
        String fam = "Копотов";

        Calendar date1 = new GregorianCalendar();
        date1.set(2002, 10, 15, 13, 40, 6);

        Calendar date2 = new GregorianCalendar();
        date2.set(2019, 10, 13, 6, 3, 7);

        System.out.println("Фамилия: " + fam);
        System.out.println("Дата взятия: " + date1.getTime());
        System.out.println("Дата сдачи: " + date2.getTime());
    }
}
