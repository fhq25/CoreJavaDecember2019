package datareading;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            String fileName = "/Users/fahim/IdeaProjects/CoreJavaDecember2019/src/datareading/sample.txt";
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String data = "";
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Invalid file name, please enter a valid file");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("IO error");
        } finally {
            bufferedReader.close();
            fileReader.close();
        }

    }
}
