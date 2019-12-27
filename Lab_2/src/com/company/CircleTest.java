package com.company;

import java.util.Scanner;

public class CircleTest {
    static Scanner sc = new Scanner(System.in);
    static Circle testCircle = new Circle();
    public static void main(String[] args) {
        System.out.println("Меню:" +
                "\n1)Ввести радиус" +
                "\n2)Ввести координату X" +
                "\n3)Ввести координату Y" +
                "\n4)Вывести все данные по кругу" +
                "\n");
        int n;
        do{
            System.out.println("Ведите команду");
            n = sc.nextInt();

            switch (n){
                case 1:
                    System.out.println("Введите радиус");
                    testCircle.setRadius(sc.nextFloat());
                    break;
                case 2:
                    System.out.println("Введите координату X");
                    testCircle.setPoxX(sc.nextFloat());
                    break;
                case 3:
                    System.out.println("Введите координату Y");
                    testCircle.setPoxY(sc.nextFloat());
                    break;
                case 4:
                    System.out.println("Радиус: " + testCircle.getRadius());
                    System.out.println("Координата X: " + testCircle.getPoxX());
                    System.out.println("Координата Y: " + testCircle.getPoxY());
                    break;
            }
        }while (n >= 1 && n <= 4);
        System.out.println("Тестирование завершено");
    }
}
