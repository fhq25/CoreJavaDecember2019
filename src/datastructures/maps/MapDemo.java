package datastructures.maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {
//        // Create a map of <Integer, String>
//        Map<Integer, String> map = new HashMap<>();
//        // Let's add some values to the map
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, "Three");
//        map.put(5, "Five");
//
//        // Replace 3's value with "Tres"
//        map.replace(3, "Tres");
//        // Remove key 5
//        map.remove(5);
//        // how can we traverse a map?
//        for (Map.Entry m : map.entrySet()) {
//            System.out.println("Key = " + m.getKey() + ", Value = " + m.getValue());
//        }

        // Create a map of student id, and their list of completed homeworks
        // 30168NY - {HW1, HW2, HW3}
        // 30154NY - {HW1, HW2}
        // 3902NY - {HW7}

        // What data type would the key be? String
        // What data type would the value be? Set of String
        // Once you know the data types, you can then create the appropriate classes necessary
        // and then implement them into a map

        // Create map that references the key as a String, and the value as a Set of String
        Map<String, Set<String>> homeworkMap = new HashMap<>();

        // Create three student IDs
        String student1Id = "30168NY";
        String student2Id = "30154NY";
        String student3Id = "3902NY";

        // Create student 1's "completed homeworks", which is really a set of string
        Set<String> student1CompletedHW = new HashSet<>();
        student1CompletedHW.add("HW1");
        student1CompletedHW.add("HW2");
        student1CompletedHW.add("HW3");

        // Create student 2's "completed homeworks", which is really a set of string
        Set<String> student2CompletedHW = new HashSet<>();
        student2CompletedHW.add("HW1");
        student2CompletedHW.add("HW2");

        // Create student 3's "completed homeworks", which is really a set of string
        Set<String> student3CompletedHW = new HashSet<>();
        student3CompletedHW.add("HW7");

        // Put the key value pairing into the map
        homeworkMap.put(student1Id, student1CompletedHW);
        homeworkMap.put(student2Id, student2CompletedHW);
        homeworkMap.put(student3Id, student3CompletedHW);

        for (Map.Entry m : homeworkMap.entrySet()) {
            System.out.println("Student ID = " + m.getKey() + ", Homework Completed = " + m.getValue());
        }

    }

}
