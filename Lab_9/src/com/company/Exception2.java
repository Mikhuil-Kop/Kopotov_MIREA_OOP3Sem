package com.company;
import java.util.Scanner;

public class Exception2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2 / i );
    }

    public static void main(String[] args) {
        try{
            exceptionDemo();
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException has been caught");
        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException has been caught");
//        }
        finally {
            System.out.println("Finally");
        }
    }
}

