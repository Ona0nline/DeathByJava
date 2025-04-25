package Manor;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

//There are multiple things in here. Different methods interact with different parts of the room. Wife was snooping around in the safe
public class Bedroom {

    private ArrayList<String> items;
    private static String safe_letter;
    private static final String Key = "S2F0ZWx5bg==";
    private static Scanner scanner;

    public Bedroom(){

    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        opensafe("675");
    }

    private static void opensafe(String Key) {

        safe_letter = "U2hlIHJvY2tzIHRoZSBjcmFkbGUsIHNvZnQgYW5kIHNsb3cKV2hpc3BlcmluZyBzZWNyZXRzIG9ubHkgd2Uga25vdwpIZXIgdG91Y2gsIGEgY29tZm9ydCwgbXkgaGVhcnQsIGFmbGFtZQpJbiBzaGFkb3dzIEkgY2FsbCBoZXIgYnkgYW5vdGhlciBuYW1lLg==";

        if (getpin().equals(Key)) {
            byte[] decodedBytes = Base64.getDecoder().decode(safe_letter);
            String decoded = new String(decodedBytes);
            System.out.println(decoded);
        } else{
            int i = 3;
            while (i > 0){
                System.out.println("1)Try again\n2)Go look for more clues");
                 int choice = scanner.nextInt();
                 scanner.nextLine();

                if(choice == 1){
                    getpin();
                    if (getpin().equals(Key)) {
                        byte[] decodedBytes = Base64.getDecoder().decode(safe_letter);
                        String decoded = new String(decodedBytes);
                        System.out.println(decoded);
                        break;
                    }
                }
                else{
                    System.out.println("Try going somewhere else/talking to someone else.");

                }
                i--;
                System.out.println("Safe Blocked.");
                break;
            }


        }

    }

    private static String getpin(){
        System.out.println("Enter pin (Safe Blocks after 3 trys):");
        String pin = scanner.nextLine();
        return pin;
    }
}
