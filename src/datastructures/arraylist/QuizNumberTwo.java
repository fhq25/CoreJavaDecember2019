package datastructures.arraylist;

import java.util.ArrayList;

public class QuizNumberTwo {

    public static void main(String[] args) {

        // In a java class, create an integer array of size 6.
        // Then using a for loop, attempt to add the numbers 1-10 into that array.

        //int[] array = new int[6]; // turn this into an ArrayList
        ArrayList<Integer> newArray = new ArrayList<>();

        try {
            for (int i = 0; i < 10; i++) {
                newArray.add(i+1);
                System.out.println(newArray.get(i));
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("Array size is too low. Please reconsider the size");
        }

        System.out.println("Code after the try block");
    }
}
