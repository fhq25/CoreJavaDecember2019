package datastructures.sets;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        // Create a hashset of student's last names from this batch

        Set<String> lastNameSet = new HashSet<>();

        // add all the different unique names into last name set
        lastNameSet.add("Hamid");
        lastNameSet.add("Sheikh");
        lastNameSet.add("Islam");
        lastNameSet.add("Rahman");
        lastNameSet.add("Ahmed");
        lastNameSet.add("Islam");
        lastNameSet.add("Islam");

        System.out.println(lastNameSet);

    }
}
