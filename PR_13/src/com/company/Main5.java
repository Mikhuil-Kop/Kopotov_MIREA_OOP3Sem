package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long start, end;

        start = System.currentTimeMillis();
        for(int i = 0; i < 999999; i++) arrayList.add(i);
        end = System.currentTimeMillis();
        long timeOfAddAL = start - end;

        start = System.currentTimeMillis();
        for(int i = 0; i < 999999; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        long timeOfAddLL = start - end;


        start = System.currentTimeMillis();
        for(int i = 0; i < 999; i++) arrayList.remove(i);
        end = System.currentTimeMillis();
        long timeOfRemoveAL = start - end;

        start = System.currentTimeMillis();
        for(int i = 0; i < 999; i++) linkedList.remove(i);
        end = System.currentTimeMillis();
        long timeOfRemoveLL = start - end;

        start = System.currentTimeMillis();
        arrayList.indexOf(600);
        end = System.currentTimeMillis();
        long timeOfIndexOfAL = start - end;

        start = System.currentTimeMillis();
        linkedList.indexOf(600);
        end = System.currentTimeMillis();
        long timeOfIndexOfLL = start - end;

        System.out.println("Время добавления в ArrayList: " + timeOfAddAL);
        System.out.println("Время добавления в LinkedList: " + timeOfAddLL);
        System.out.println("Время удаления из ArrayList: " + timeOfRemoveAL);
        System.out.println("Время удаления из LinkedList: " + timeOfRemoveLL);
        System.out.println("Время поиска в ArrayList: " + timeOfIndexOfAL);
        System.out.println("Время поиска в LinkedList: " + timeOfIndexOfLL);
    }
}
