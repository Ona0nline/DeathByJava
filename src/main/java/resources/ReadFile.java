package resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try {
//            FILL IN CORRECT DIRECTORY
            File myFile = new File("C:\\Users\\onasi\\sem2\\DeathByJava\\src\\main\\java\\resources\\safe_letter.txt");

            Scanner reader = new Scanner(myFile);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}