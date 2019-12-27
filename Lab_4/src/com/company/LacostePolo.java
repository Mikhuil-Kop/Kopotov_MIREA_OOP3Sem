package com.company;

public class LacostePolo implements Priceble{
    private int Size;
    private static float clothCost = 27;
    private static float brand = 10;

    public LacostePolo(int size){
        if (size > 60)
            Size = 60;
        else if (size < 44)
            Size = 44;
        else
            Size = size;
    }

    @Override
    public float getPrice() {
        return Size * clothCost * brand;
    }
}
