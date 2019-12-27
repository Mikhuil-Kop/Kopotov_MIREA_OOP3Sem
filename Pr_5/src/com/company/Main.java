package com.company;

import javafx.concurrent.Task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------\nЗАДАНИЕ 1");
        Task1();
        System.out.println("--------------------------------------------------------\nЗАДАНИЕ 2");
        Task2();
        System.out.println("--------------------------------------------------------\nЗАДАНИЕ 3");
        Task3(123456789);
        System.out.println("--------------------------------------------------------\nЗАДАНИЕ 4");
        Task4(123456789);
        System.out.println("--------------------------------------------------------\nЗАДАНИЕ 5");
        Cortege c = Task5();
        System.out.println("Количество вхождений максимума (" + c.max + ") : " + c.count);
    }


    static void Task1(){//12
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n != 0) {
            if (n % 2 == 0)
                System.out.println(n);
            Task1();
        }
    }

    static void Task2(){//13
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n != 0) {
            System.out.println(n);
            if (scanner.nextInt() != 0)
                Task2();
        }
    }

    static void Task3(int n){//14
        int out = n%10;
        n = n / 10;
        if(n != 0)
            Task3(n);
        System.out.println(out);
    }
    static void Task4(int n){//15
        int out = n%10;
        n = n / 10;
        System.out.println(out);
        if(n!=0)
            Task4(n);
    }

    static Cortege Task5() {//16
        int n = new Scanner(System.in).nextInt();

        if (n != 0) {
            Cortege downCortege = Task5();

            if (n > downCortege.max) {
                return new Cortege(n, 1);
            }

            if (n < downCortege.max) {
                return new Cortege(downCortege.max, downCortege.count);
            }

            return new Cortege(downCortege.max, downCortege.count + 1);

        } else {
            //конец рекурсии
            return new Cortege(0, 1);
        }
    }

   static class Cortege{
        public int max, count;
        public Cortege(int max, int count){
            this.max = max;
            this.count = count;
        }
    }
}
