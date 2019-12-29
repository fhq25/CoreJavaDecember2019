package datastructures.arraylist;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {

        // How to declare an array list?
        // How to initialize an array list?

        ArrayList<String> myArrayList = new ArrayList<>();

        // Let us add values to the array list
        // Add the names "Joe", "Bob", "Tim" into the array list
        myArrayList.add("Joe");
        myArrayList.add("Bob");
        myArrayList.add("Tim");

        System.out.println("---------------------------------");

        // retrieve the first name from the array list
        System.out.println(myArrayList.get(0)); // Joe
        System.out.println(myArrayList.get(1)); // Bob

        System.out.println("---------------------------------");

        // Get the size of the array list
        System.out.println(myArrayList.size()); // 3

        System.out.println("---------------------------------");

        // Remove "Bob" from the array list
        myArrayList.remove("Bob");

        System.out.println("---------------------------------");

        // Get the value from the 1st index
        System.out.println(myArrayList.get(1)); // Tim

        System.out.println("---------------------------------");


        // "Joe", "Tim"
        // Check if "Joe" exists in the array list
        if (myArrayList.contains("Joe")) {
            System.out.println("Joe exists");
        } else {
            System.out.println("Joe doesn't exist");
        }

        System.out.println("---------------------------------");

        // Add in Sarah right after Joe
        // Joe, Sarah, Tim
        myArrayList.add(1, "Sarah");

        System.out.println("---------------------------------");

        // Print out all of the names from the array list
        for (String name : myArrayList) {
            System.out.println(name);
        }

        System.out.println("---------------------------------");
        // How to find out what index an object is residing in
        // indexOf
        System.out.println("Joe is at index: " + myArrayList.indexOf("Joe"));

    }

}