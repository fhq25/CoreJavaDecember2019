package trycatch;

import java.util.Scanner;

public class Main {
    // Write a program that asks the user for their age
    // If they're above 18 years old, then they can enroll in the PnT course
    // If not, then print out a message that they need to be 18 years or older
    public static void main(String[] args) {
//        // 1. Create a scanner object
//        Scanner sc = new Scanner(System.in);
//
//        // 2. Ask the user for their age, and store the input somewhere
//        System.out.println("Please enter your age");
//        int age = sc.nextInt();
//
//        // 3. Check to see if their age meets the requirements for enrollment
//        //      A. If they're above 18, then print out that they're eligible
//        //      B. If not, then print out that they're NOT eligible
//
//        if (age >= 1 && age <= 115) {
//            if (age >= 18) {
//                System.out.println("You are eligible to enroll");
//            } else {
//                System.out.println("You are not eligible");
//            }
//        } else {
//            System.out.println("Not a valid input");
//        }


        // try - catch
        // try: block where you're going to be executed the code
        // catch: if an exception occurs in the try block, then you can handle that exception

        int[] array = new int[3];

        try {
            array[0] = 5;
            array[1] = 9;
            array[2] = 11;
            array[4] = 3;
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("hello");
        System.out.println("car");
    }

}
