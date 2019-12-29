package concepts.oop.polymorphism;

public class TestArea {

    public static void main(String[] args) {
        System.out.println(Area.findArea(5)); // ~78
        System.out.println(Area.findArea(10.0, 15.0)); // 75
        System.out.println(Area.findArea(3)); // 9
        System.out.println(Area.findArea(9, 4)); // 18
    }

}