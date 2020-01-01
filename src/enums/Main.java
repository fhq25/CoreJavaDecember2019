package enums;

public class Main {

    // Enums
    // - Serves the purpose of representing a group

    public static void main(String[] args) {

        System.out.println("I currently live in " + Country.USA.getName());
        System.out.println("The capital of US is " + Country.USA.getCapital());

        // Write an if statement that prints out which population is bigger
        // between India and Bangladesh
        if (Country.INDIA.getPopulation() > Country.BANGLADESH.getPopulation()) {
            System.out.println("India has a bigger population");
        } else {
            System.out.println("Bangladesh has a bigger population");
        }


    }

}
