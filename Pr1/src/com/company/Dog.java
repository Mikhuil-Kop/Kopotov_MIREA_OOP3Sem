package com.company;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Dog {
    private String name;
    private int age;

    public Dog(){
        name = "Мяу";
        age = 0;
    }

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void AddAge() {
        this.age++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ToHumanAges(){
        return age * 5;
    }

    @Override
    public String toString() {
        return "Собака по имени " + name + " с возрастом " + age;
    }
}
