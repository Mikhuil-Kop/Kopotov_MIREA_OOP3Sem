package com.company;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo4 {
    public static void getKey() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();

        try {
            printDetails(key);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception has been caught in 1 catch bracket");
        }
        catch(java.lang.Exception ex) {
            System.out.println("Exception has been caught in 2 catch bracket");
        }
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message ); }

    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}
