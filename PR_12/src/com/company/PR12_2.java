package com.company;

import java.util.StringTokenizer;

class Adress
{
    private String country,region, town, street, house, flat;

    public Adress(String fullAdress)
    {
        String[] strs;
        strs = fullAdress.split(",");
        if(strs.length < 6)
            return;
        country = strs[0];
        region = strs[1];
        town = strs[2];
        street = strs[3];
        house = strs[4];
        flat = strs[5];
    }
    public Adress(String fullAdress, String token)
    {
        StringTokenizer tokenizer = new StringTokenizer(fullAdress, token);
        country = tokenizer.nextToken();
        region = tokenizer.nextToken();
        town = tokenizer.nextToken();
        street = tokenizer.nextToken();
        house = tokenizer.nextToken();
        flat = tokenizer.nextToken();
    }
    public String getTown(){
        return town;
    }

}

public class PR12_2 {
    public static void main(String[] args)
    {
        Adress adress1 = new Adress("strana,region,gorod,ulica,dom,kvar");
        Adress adress2 = new Adress("strana,region.gorod/ulica:dom-kvar", ",./:-");
        System.out.println(adress1.getTown());
        System.out.println(adress2.getTown());
    }
}
