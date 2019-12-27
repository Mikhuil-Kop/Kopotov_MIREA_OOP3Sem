package com.company;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> states = new MyArrayList<String>();
        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add("Великобритания");
        states.add("Испания");
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.println(states.get(1));// получаем 2-й объект
        states.set(1, "Дания"); // установка нового значения для 2-го объекта

        System.out.printf("В списке %d элементов \n", states.size());
        // for(String state : states){
        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));
        }

        System.out.println("Удаляем элемента с индексом 3: " + states.remove(3));
        for (String s : states)
            System.out.println("\t"+s);

        //обрезка
        System.out.println("Вырезаем элементы с первого по третий индексыы");
        Object[] SubStates;
        SubStates = states.subList(1,3);
        for (int i = 0; i < SubStates.length; i++) {
            System.out.println("\t\t" + SubStates[i]);
        }

        if(states.contains("Германия")){
          System.out.println("Список содержит государство Германия");
        }
    }
}
