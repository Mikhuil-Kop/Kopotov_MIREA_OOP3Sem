package com.company_1;

public class Main {

    public static void main(String[] args) {
        Shape []shapes = new Shape[3];
        shapes[0] = new circle(5, "red", false);
        shapes[1] = new rectangle(1, 2, "green", false);
        shapes[2] = new square(10, "blue", true);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("\tФорма:\t" + shapes[i]);
            System.out.println("\tПлощадь:\t" + shapes[i].getArea());
            System.out.println("\tПеримитер:\t" + shapes[i].getPerimeter());
            System.out.println("\tЦвет:\t" + shapes[i].getColor());
            System.out.println("\tЗаполнен:\t" + shapes[i].isFilled());
        }

        System.out.println("-------------------------------------------------------\nДанные изменены");
        ((circle)shapes[0]).setRadius(20);
        ((rectangle)shapes[1]).setLength(20);
        ((rectangle)shapes[2]).setLength(20);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("-------------------------------------------------------");
            System.out.println("\tФорма:\t" + shapes[i]);
            System.out.println("\tПлощадь:\t" + shapes[i].getArea());
            System.out.println("\tПеримитер:\t" + shapes[i].getPerimeter());
            System.out.println("\tЦвет:\t" + shapes[i].getColor());
            System.out.println("\tЗаполнен:\t" + shapes[i].isFilled());
        }

    }
}
