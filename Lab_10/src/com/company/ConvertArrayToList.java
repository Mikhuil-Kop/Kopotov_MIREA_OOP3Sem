package com.company;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayToList {

    public static <T> List<T> convert(Object[] array) {
        List arrayList = new ArrayList<>();
        for (Object element : array) {
            arrayList.add( element);
        }
        return (ArrayList<T>)arrayList;
    }

    public static void main(String[] args) {
        Integer[] array = {0, 1, 2, 3, 4};
        List<Integer>list;
        list = convert(array);
        for (Object element : list) {
            System.out.print(element + " ");
        }
    }
}