package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main3 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        calendar.set(2000, 15, 10, 0,  0, 0);
        Student student = new Student("Миша Копотов", calendar);

        System.out.println(student.toString());
    }
}
