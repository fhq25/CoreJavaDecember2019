package datastructures.arraylist;

// Group Assignment:
// Create an app that takes in a list of all students enrolled in the PnT course.
// Inside the app, write a feature that will do the following...
//     1. displays the average goal salary of the class
//     2. displays the student's info whose goal salary is the highest (bonus)
// Expected Output:
//          Average Goal Salary: 110200.00
//          1234NYA_John_Doe has the biggest goal salary of 135850.75.

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 1. Create the student array list
        ArrayList<Student> students = new ArrayList<>();

        // 2. Create a scanner object and grab the number of students to be enrolled.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of students to be enrolled: ");
        int size = sc.nextInt();

        // 3. Ask the students to enter in their information
        // Once all information is retrieved by the student, create a Student object
        // Then store the student object into the student array list
        for (int i = 0; i < size; i++) {
            // Get student's id
            System.out.println("Please enter student " + (i+1) + "'s id: ");
            String id = sc.next();
            // Get student's first name
            System.out.println("Please enter student " + (i+1) + "'s first name: ");
            String firstName = sc.next();
            // Get student's last name
            System.out.println("Please enter student " + (i+1) + "'s last name: ");
            String lastName = sc.next();
            // Get student's goal salary
            System.out.println("Please enter student " + (i+1) + "'s desired salary: ");
            double goalSalary = sc.nextDouble();
            // Create the student object
            Student st = new Student(id, firstName, lastName, goalSalary);
            // Store the student into the student array list
            students.add(st);
        }

        // 4. Calculate the average goal salary for the student class.
        double average = findAverage(students);
        System.out.println("Average Goal Salary: " + average);
        findStudentWithHighestSalary(students);

    }
    public static double findAverage(ArrayList<Student> studentList) {
        // get the number of students
        int count = studentList.size();

        // get the total goal salary of all students
        double total = 0;
        for (Student st : studentList) {
            // grab each student's goal salary, and then add it to the total
            total = total + st.getGoalSalary();
        }
        return total/count;
    }

    public static void findStudentWithHighestSalary(ArrayList<Student> studentList) {
        // Create a temp student variable, and assign the first student to that variable
        Student studentWithTheHighestSalary = studentList.get(0);
        for (int i = 1; i < studentList.size(); i++) {
            // check to see if student i has a bigger salary than highestSalary
            // if student i does have a bigger salary than highestSalary
            // then we assign highestSalary to student i's goal salary
            if (studentWithTheHighestSalary.getGoalSalary() < studentList.get(i).getGoalSalary()) {
                studentWithTheHighestSalary = studentList.get(i);
            }
        }
        System.out.println(studentWithTheHighestSalary.getId() + "_" + studentWithTheHighestSalary.getFirstName()
        + "_" + studentWithTheHighestSalary.getLastName() + " has the biggest goal salary of " +
                studentWithTheHighestSalary.getGoalSalary() + ".");
        //1234NYA_John_Doe has the biggest goal salary of 135850.75.
    }

}