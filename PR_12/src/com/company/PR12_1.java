package com.company;

class Person
{
    private String fullName;
    public Person()
    {
        fullName = null;
    }
    public Person(String fullName)
    {
        this.fullName = fullName;
    }
    public String getFullName()
    {
        if (!fullName.isEmpty())
            return fullName;
        return null;
    }
}

public class PR12_1 {
    public static void main(String[] args)
    {
        Person p = new Person("Джотаро Куджо");
        System.out.println(p.getFullName());
    }
}
