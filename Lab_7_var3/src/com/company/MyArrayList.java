package com.company;
import javax.naming.PartialResultException;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class MyArrayList<T> implements Iterable<T>{
    Object[] arr = new Object[0];

    public MyArrayList(Collection<T> col){
        if(col == null){//ОШИБКА
            return;
        }
        arr = new Object[col.size()];
        int i = 0;

        for (T t : col) {
            arr[i] = col;
            i++;
        }
    }

    public  MyArrayList(int size){
        if(size >= 0)
            arr = new Object[size];
        else
            arr = new Object[0];

    }

    public  MyArrayList(){
        arr = new Object[0];
    }

    public int size(){return arr.length;}

    public void add(int index, T enter) {
        if (index < 0 || index > arr.length){
            //ОШИБКА
            return;
        }
        var oldArr = arr;
        arr = new Object[oldArr.length + 1];

        for(int i = 0; i < index; i++)
            arr[i] = oldArr[i];

        arr[index] = enter;

        for (int i = index; i < oldArr.length; i++)
            arr[i + 1] = oldArr[i];
    }

    public void add(T enter){
        add(arr.length, enter);
    }

    //index - место, на котором появится первый элемент col
    public boolean addAll(int index, Collection<T> col) {
        if(index > arr.length)
            return false;

        var oldArr = arr;
        arr = new Object[oldArr.length + col.size()];

        for(int i = 0; i < index; i++){
            arr[i] = oldArr[i];
        }
        for(int i = index; i < oldArr.length; i++){
            arr[i + col.size()] = oldArr[i];
        }
        int j = 0;
        for (T t : col) {
            arr[index + j] = t;
            j++;
        }

        return true;
    }

	public T get(int index){
        if(index < 0 || index >= arr.length) {
            //ОШИБКА
            return null;
        }
        return (T)arr[index];
    }

    public void set(int index, T obj){
        if(index < 0 || index >= arr.length) {
            //ОШИБКА
            return;
        }
        arr[index] = obj;
    }

    public int indexOf(T obj){
        for(int i = 0; i < arr.length; i++) {
            if (obj == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T obj){
        for(int i = arr.length - 1; i >= 0; i--) {
            if (obj == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int index){
        if(index < 0 || index >= arr.length){
            //ОШИБКА
            return null;
        }
        var oldArr = arr;
        arr = new Object[oldArr.length - 1];

        for(int i = 0; i < index; i++)
            arr[i] = oldArr[i];
        for (int i = index + 1; i < oldArr.length; i++)
            arr[i - 1] = oldArr[i];

        return (T)oldArr[index];
    }

    public void sort(Comparator<T>comp){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(comp.compare((T)arr[i], (T)arr[j]) == 1){
                    Object change = arr[i];
                    arr[i] = arr[j];
                    arr[j] = change;
                }
            }
        }
    }

    public T[] subList(int start, int end){
        if(start < 0 || start >= arr.length || end < 0 || end >= arr.length || start > end) {//ОШИБКА
            return null;
        }
        var list = new Object[end - start + 1];
        for(int i = start; i <= end; i++)
            list[i - start] = arr[i];
        return (T[])list;
    }

    public boolean contains(T t){
        return indexOf(t) != -1;
    }


    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            int index = -1;
            @Override
            public boolean hasNext() {
                return index < arr.length - 1;
            }

            @Override
            public T next() {
                index++;
                return (T)arr[index];
            }
        };
        return it;
    }


}

