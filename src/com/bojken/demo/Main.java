package com.bojken.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //for  (int i = 0; i < 5; i++) {
          //  System.out.println("index: " + i);
        //}

        int[] numbers = {0, 100, 1000};

        System.out.println("Before crash");

        try {
            // Try to execute code
            System.out.println("Inside - TRY");
            System.out.println(2/0);
        } catch (Exception error) {
            // Catch error if it FAILS
            System.out.println("Inside - CATCH");
            error.printStackTrace();
        }


        System.out.println("After crash");




       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Typ something to  crash the program");
       // scanner.nextLine();

       // for (int i = 0; i < numbers.length; i++) {
         //   System.out.println(numbers[i]);
       // }
    }
}
