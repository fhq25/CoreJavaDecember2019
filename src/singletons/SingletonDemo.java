package singletons;

public class SingletonDemo {

    // Variables of a singleton
    private int number;
    private String name;

    // Private constructor
    // This prevents other classes from instantiating this class
    // THis can only be instantiated WITHIN this class
    private SingletonDemo(){
        this.number = 10;
        this.name = "Singleton name";
    }

    // Create the instance of the singleton class
    private static SingletonDemo instance = new SingletonDemo();

    // Providing a global point of access to the instance
    public static SingletonDemo getInstance() {
        return instance;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
}
