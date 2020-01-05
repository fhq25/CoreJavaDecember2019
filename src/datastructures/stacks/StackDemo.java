package datastructures.stacks;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // Create a stack of pancakes (minimum of 6 pancakes, each pancake should
        // be a different flavor from one another)

        // Hint: Create a pancake class
        // each pancake should be a different flavor... so how should the pancake class
        // be defined? How should a pancake be constructed?

        // Once you have designed your pancake class, create six pancake objects and add them
        // to the stack.

        // how to add items to a stack? Instead of add(), we use "push()"

        Pancake blueberryPancake = new Pancake("Blueberry");
        Pancake chocoPancake = new Pancake("Chocolate");
        Pancake plainPancake = new Pancake("Plain");
        Pancake buttermilkPancake = new Pancake("Buttermilk");
        Pancake veganPancake = new Pancake("Vegan");
        Pancake glutenFreePancake = new Pancake("Gluten Free");

        Stack<Pancake> pancakeStack = new Stack<>();
        pancakeStack.push(blueberryPancake);
        pancakeStack.push(chocoPancake);
        pancakeStack.push(plainPancake);
        pancakeStack.push(buttermilkPancake);
        pancakeStack.push(veganPancake);
        pancakeStack.push(glutenFreePancake);

        // See whats at the top of the pancake stack
        System.out.println("The pancake at the very top is " + pancakeStack.peek().getFlavor());

        // "Eat" (pop) a pancake
        pancakeStack.pop();

        // See whats at the top of the pancake stack
        System.out.println("The pancake at the very top is " + pancakeStack.peek().getFlavor());

        // use for loop, for each loop and iterator to iterate the stack of pancakes
        for (int i = 0; i < pancakeStack.size(); i++) {
            System.out.println(pancakeStack.get(i).getFlavor());
        }

        System.out.println("-----");
        for (Pancake pancake : pancakeStack) {
            System.out.println(pancake.getFlavor());
        }

//        System.out.println("-----");
//        Iterator iterator = pancakeStack.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }

}
