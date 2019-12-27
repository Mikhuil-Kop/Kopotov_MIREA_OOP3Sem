package com.company;

public class PlainPoloShirt implements Priceble {
    private int Size;
    private static float clothCost = 26;

    public PlainPoloShirt(int size) {
        if (size > 60)
            Size = 60;
        else if (size < 44)
            Size = 44;
        else
            Size = size;
    }

    @Override
    public float getPrice() {
        return Size * clothCost;
    }
}
