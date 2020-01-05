package datastructures.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Implementing a linked list of characters
        // here I've created an empty linked list of type Character
        LinkedList<Character> characterLinkedList = new LinkedList<>();

        // Adding in elements into the linked list
        characterLinkedList.add('S');
        characterLinkedList.add('C');
        characterLinkedList.add('H');
        characterLinkedList.add('O');
        characterLinkedList.add('O');
        characterLinkedList.add('L');

        // Removing an element from a linked list
        characterLinkedList.remove(2);

        // use a for loop to print out all characters from this list
        System.out.println("\nUsing for loop");
        for (int i = 0; i < characterLinkedList.size(); i++) {
            System.out.println(characterLinkedList.get(i));
        }

        // use a for each loop to print out all characters from this list
        System.out.println("\nUsing for each loop");
        for (Character c : characterLinkedList) {
            System.out.println(c);
        }

        // use iterator to print out all characters from this list
        System.out.println("\nUsing iterator");
        Iterator iterator = characterLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
