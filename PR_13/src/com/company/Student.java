package com.company;

import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    private String name;
    private Calendar dateOfBirthday;
    
    public Student(String name, Calendar dateOfBirthday) {
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(dateOfBirthday.getTime());
    }
}
