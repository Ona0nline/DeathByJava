package Manor;

import org.fusesource.jansi.Ansi;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

/***
 Run the programme to read the safe pin hint.
 If you feel like you know what it is, pass it in as a parameter in opensafe().
***/

public class Bedroom {

    private ArrayList<String> items;
    private static String safe_letter;
    private static Scanner scanner;

    public Bedroom(){

    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        safe_letter = "U2hlIHJvY2tzIHRoZSBjcmFkbGUsIHNvZnQgYW5kIHNsb3cKV2hpc3BlcmluZyBzZWNyZXRzIG9ubHkgd2Uga25vdwpIZXIgdG91Y2gsIGEgY29tZm9ydCwgbXkgaGVhcnQsIGFmbGFtZQpJbiBzaGFkb3dzIEkgY2FsbCBoZXIgYnkgYW5vdGhlciBuYW1lLg==";
        byte[] decodedBytes = Base64.getDecoder().decode(safe_letter);
        String decoded = new String(decodedBytes);
        System.out.println(decoded);

        opensafe("Odelia");
    }

    private static void opensafe(String Key) {



        if (getpin().equals(Key)) {
            System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).a("Congratulations!\n\nYour next task is to navigate to the 'resources' package and write the code to read the contents of the file.\n\nOnce you've completed that, return here and decode the file contents. Finally, print the decoded message in the console to reveal the secret.").reset());

        } else{
            int i = 3;
            while (i > 0){
                System.out.println("1)Try again\n2)Go look for more clues");
                 int choice = scanner.nextInt();
                 scanner.nextLine();

                if(choice == 1){
                    getpin();
                    if (getpin().equals(Key)) {
                        System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).a("Congratulations!\n\nYour next task is to navigate to the 'resources' package and write the code to read the contents of the file.\n\nOnce you've completed that, return here and decode the file contents. Finally, print the decoded message in the console to reveal the secret.").reset());
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
