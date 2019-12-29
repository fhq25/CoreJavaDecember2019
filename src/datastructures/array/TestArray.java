package datastructures.array;

public class TestArray {

    public static void main(String[] args) {

//        // create an array of size 8, and it holding the following data
//        // respectively
//        // 8, 3, 22, 7, 16, 4, 1, 9
//
//        int[] myArray = {8, 3, 22, 7, 16, 4, 1, 9};
//
//        //int size = myArray.length;
//
//        int number = myArray[myArray.length - 1]; // index 7, which happens to have the value 9
//        System.out.println(number);

        System.out.println("--------------------------------------------");

        // create an array of size 5
        // once you're done creating the array, add the following values
        // "Joe", "John", "Sarah", "Tim", "Bob"

        String[] names = new String[5];
        // we just created an array of String that can hold 5 string data
        // fill out the array with the names
        names[0] = "Joe";
        names[1] = "John";
        names[2] = "Sarah";
        names[3] = "Tim";
        names[4] = "Bob";

        // Now print out the names from the array
        // You will need to use a for loop
        // for (initialization ; termination; increment/decrement) {
        //      code
        // }
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        System.out.println("--------------------------------------------");

        // create an int array of size 50
        // add in numbers from 1-50 into the array, respectively

//        int[] numArray = new int[50];
//        for (int i = 0; i < numArray.length; i++) {
//            numArray[i] = i + 1;
//        }
//
//        for (int i = 0; i < numArray.length; i++) {
//            System.out.println(numArray[i]);
//        }


        int[] testArray = new int[5];
        testArray[0] = 2;
        testArray[1] = 3;
        testArray[2] = 8;
        testArray[3] = 11;
        testArray[4] = 92;
        testArray[5] = 23;

        for (int x : testArray) {
            System.out.println(x);
        }

    }

}
