package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Дружок", 2);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.AddAge();
        dog1.AddAge();
        dog2.AddAge();
        dog3.setName("Собакен");
        System.out.println("-------------------------------------------------------");
        System.out.println("\t"+dog1);
        System.out.println("\t"+dog2);
        System.out.println("\t"+dog3);
        System.out.println("-------------------------------------------------------");

        Ball ball1 = new Ball(15);
        Ball ball2  = new Ball(2);
        Ball ball3 = new Ball();

        ball2.setWeigth(222);

        System.out.println("\t"+ball1);
        System.out.println("\t"+ball2);
        System.out.println("\t"+ball3);
        System.out.println("-------------------------------------------------------");

        Book book1 = new Book("Зов втулки", "Гриша Любовьремесло");
        Book book2 = new Book("Бизарные приключения ЖИЖИ", "Дед");
        Book book3 = new Book();

        System.out.println("\t"+book1);
        System.out.println("\t"+book2);
        System.out.println("\t"+book3);
        System.out.println("-------------------------------------------------------");
    }
}
