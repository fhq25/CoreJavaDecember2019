package datastructures.array;

import java.util.Scanner;

// Create an application that stores your list of friends into an array
// Create a scanner object. Use the scanner to get input from user.
// Ask the user how many friends do they have.
// Ask them to enter in all their friends up to that size.
// Then print out all the friends' names.
public class FriendsApp {

    public static void main(String[] args) {

        // 1. Create a scanner object.
        Scanner sc = new Scanner(System.in);

        // 2. Use the scanner object to get the size from the user.
        // You can store this size somewhere.
        System.out.println("How many friends do you have?");
        int numOfFriends = sc.nextInt();

        // 3. Create an array with the size given by the user.
        String[] friends = new String[numOfFriends];

        // 4. Create a for loop and inside that for loop, grab the
        // user's input (when asking them to provide their friend's name),
        // and then store that name into the array.
        for (int i = 0; i < numOfFriends; i++) {
            System.out.println("Please enter your friend " + (i+1) + "'s name");
            String friendName = sc.next();
            friends[i] = friendName;
        }

        // 5. Use a for each that iterates through the array
        // and print out all the names.
        System.out.println("Your friends are...");
        for (String s : friends) {
            System.out.println(s);
        }

    }

}