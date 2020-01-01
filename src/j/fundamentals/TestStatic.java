package j.fundamentals;

public class TestStatic {

    // 1. Variables
    // 2. Methods
    // 3. Blocks
    // 4. Nested classes

    static {
        System.out.println("Hello 1");
    }

    static {
        System.out.println("Hello 2");
    }


    public static void main(String[] args) {
        // Exercise: Create a class called PeopleNTechCampus
        // and give it some variables and methods

        // Create a class called Bike
        // Then in the main class, create 5 bikes, and then
        // print out the total number of bikes created (using a static method)
        Bike bike1 = new Bike("dirt", 300.50);
        Bike bike2 = new Bike("mountain", 270.20);
        Bike bike3 = new Bike("city", 900.99);
        Bike bike4 = new Bike("road", 654.32);
        Bike bike5 = new Bike("dirt", 705.76);

        System.out.println(Bike.getCount()); // prints 5

    }

    static {
        System.out.println("Hello 3");
    }
}
