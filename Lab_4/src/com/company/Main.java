package com.company;

public class Main {

    public static void main(String[] args) {
	    Priceble store[] = new Priceble[5];
        store[0] = new PlainPoloShirt(30);
        store[1] = new LacostePolo(12);
        store[2] = new LacostePolo(50);
        store[3] = new PlainPoloShirt(50);
        store[4] = new PlainPoloShirt(70);

        for(int i = 0; i < 5; i++)
            System.out.println(store + ": " + store[i].getPrice());
    }
}
