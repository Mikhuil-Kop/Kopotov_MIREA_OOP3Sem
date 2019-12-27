package com.company_2;

public class Main {
    public static void main(String[] args)
    {
        Movable m1 = new MovablePoint(5, 6, 10, 10);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        m1.moveUp();
        System.out.println(m1);

        System.out.println("---------------------------------------------------------------------------------------------");

        Movable m2 = new MovableCircle(2, 1, 2, 2, 20); // upcast
        System.out.println(m2);
        m2.moveRight();
        m2.moveUp();
        System.out.println(m2);

        System.out.println("---------------------------------------------------------------------------------------------");

        Movable m3 = new MovableRectangle(3,4,5,6,10,20);
        System.out.println(m3);
        m3.moveRight();
        m3.moveUp();
        System.out.println(m3);
    }
}
