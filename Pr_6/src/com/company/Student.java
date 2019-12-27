package com.company;

import java.util.Random;

public class Student implements Comparable<Student> {
    int x, y;

    public Student(){
        Random rand = new Random();
        x = Math.abs(rand.nextInt() % 10);
        y = Math.abs(rand.nextInt() % 10);
    }

    @Override
    public int compareTo(Student t) {//-1 меньше, 1 больше, 0 равно
        if (x < t.x)
            return -1;
        if (x > t.x)
            return 1;

        if (y < t.y)
            return -1;
        if (y > t.y)
            return 1;

        return 0;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
