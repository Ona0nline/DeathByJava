package resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/***
 * Fill in the correct directory to read the file
 * Print out the contents and decode them.
 ***/
public class ReadFile {
    public static void main(String[] args) {
        try {

            File myFile = new File("C:\\Users\\onasi\\sem2\\DeathByJava\\src\\main\\java\\resources\\safe_letter.txt");

        } catch (Exception e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}