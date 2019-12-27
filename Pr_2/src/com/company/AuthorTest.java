package com.company;

public class AuthorTest {
    public void TestAuthor() {
        Author a1 = new Author("Mike", "josh.wr@gmail.com", 'm');
        Author a2 = new Author("Josh", "not.josh.rw@gmail.ru", 'm');
        Author a3 = new Author("Ember", "ember.or.amber@gmail.com", 'f');

        System.out.println("1)\t" + a1);

        a1.setEmail("new.new.email@gmail.com");

        System.out.println("1)\t" + a1);
        System.out.println("2)\t" + a2);
        System.out.println("3)\t" + a3);
    }
}
