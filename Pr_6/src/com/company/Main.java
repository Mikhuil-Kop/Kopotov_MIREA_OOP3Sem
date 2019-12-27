package com.company;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Student[] arr1 = new Student[10];
        Student[] arr2 = new Student[10];
        Student[] arr31 = new Student[10];
        Student[] arr32 = new Student[10];
        for (int i = 0; i < arr1.length; i++) arr1[i] = new Student();
        for (int i = 0; i < arr2.length; i++) arr2[i] = new Student();
        for (int i = 0; i < arr31.length; i++) arr31[i] = arr1[i];
        for (int i = 0; i < arr32.length; i++) arr32[i] = arr2[i];

        System.out.println("------------------------------------------------------------\nМАССИВ 1");
        System.out.println(ArrToStr(arr1));
        System.out.println("------------------------------------------------------------\nМАССИВ 2");
        System.out.println(ArrToStr(arr2));

        Sort1(arr1, 1, arr1.length);
        Sort2(arr2, 0, arr2.length - 1);
        Comparable[] arr3 = Sort3(Merge(arr31, arr32));

        System.out.println("------------------------------------------------------------\nОТСОРТИРОВАННЫЙ МАССИВ 1");
        System.out.println(ArrToStr(arr1));
        System.out.println("------------------------------------------------------------\nОТСОРТИРОВАННЫЙ МАССИВ 2");
        System.out.println(ArrToStr(arr2));
        System.out.println("------------------------------------------------------------\nОТСОРТИРОВАННЫЙ МАССИВ 3");
        System.out.println(ArrToStr(arr3));
    }

    static String ArrToStr(Object[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length - 1; i++)
            s += arr[i] + ", ";
        s += arr[arr.length - 1] + "]";
        return s;
    }

    //сортировка вставкой
    static void Sort1(Comparable[] arr, int start, int end) {
        int i, j;
        Comparable change;

        for (i = start; i < end; i++) {
            change = arr[i];
            for (j = i - 1; j >= start - 1 && arr[j].compareTo(change) == 1; j--)
                arr[j + 1] = arr[j];
            arr[j + 1] = change;
        }
    }

    //Быстрая сортировка
    static void Sort2(Comparable[] arr, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && arr[i].compareTo(arr[cur]) == -1) {
                i++;
            }
            while (j > cur && arr[cur].compareTo(arr[j]) == -1) {
                j--;
            }
            if (i < j) {
                Comparable temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        Sort2(arr, start, cur);
        Sort2(arr, cur + 1, end);
    }

    //Сортировка слиянием
    public static Comparable[] Sort3(Comparable[] arr) {
        if (arr.length < 2) return arr;
        int m = arr.length / 2;
        Comparable[] arr1 = Arrays.copyOfRange(arr, 0, m);
        Comparable[] arr2 = Arrays.copyOfRange(arr, m, arr.length);
        return Merge(Sort3(arr1), Sort3(arr2));
    }


    public static Comparable[] Merge(Comparable[] arr1, Comparable arr2[]) {
        int n = arr1.length + arr2.length;
        Comparable[] arr = new Comparable[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                arr[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                arr[i] = arr1[i1++];
            } else {
                if (arr1[i1].compareTo(arr2[i2]) == -1) {
                    arr[i] = arr1[i1++];
                } else {
                    arr[i] = arr2[i2++];
                }
            }
        }
        return arr;
    }

}
