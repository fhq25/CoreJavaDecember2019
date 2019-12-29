package concepts.oop.encapsulation;

public class TestStudent {

    public static void main(String[] args) {
        Student studentOne = new Student("John Doe");
        studentOne.setName("Bob");
        System.out.println(studentOne.getName());
    }

}