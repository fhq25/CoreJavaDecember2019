package singletons;

public class Main {
    // singleton class is a class that can only have one object
    // (an instance of the class) at a time
    // The singleton's purpose is to control object creation, limiting the number
    // of objects to ONLY one.
    // Since there is one Singleton instance, any instance fields of a Singleton will
    // only occur once per class, just like static fields.

    public static void main(String[] args) {

        SingletonDemo obj1 = SingletonDemo.getInstance();
        System.out.println("Obj1 name: " + obj1.getName()); // prints out singleton name
        System.out.println("Obj1 number: " + obj1.getNumber()); //prints out 10

        // change the number value from 10 to 15
        obj1.setNumber(15);
        System.out.println("Obj1 number AFTER change: " + obj1.getNumber()); //prints out 15

        SingletonDemo obj2 = SingletonDemo.getInstance();
        System.out.println("Obj2 name: " + obj2.getName()); // prints out singleton name
        System.out.println("Obj2 number: " + obj2.getNumber()); // 15
    }
}
