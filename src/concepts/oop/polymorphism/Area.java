package concepts.oop.polymorphism;

public class Area {

    // write a method that calculates the area of a triangle
    // .5 * base * height
    // findAreaOfATriangle(???)
    // [access specifier] [return type] [method name] ( [parameters] ) {
    //         method body
    // }
    public static double findArea(double base, double height) {
        return .5 * base * height;
    }

    // write a method that calculates the area of a circle
    // pi * radius^2
    // pi = 3.14
    // findAreaOfACircle(???)
    public static double findArea(double radius) {
        return Math.PI * radius * radius;
    }

    // write a method that calculates the area of a square
    // length * width
    // findAreaOfASquare(???)
    public static int findArea(int side) {
        return side * side;
    }

    // write a method that calculates the area of a square
    // length * width
    // findAreaOfARectangle(???)
    public static int findArea(int length, int width) {
        return length * width;
    }
}
