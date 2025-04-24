package Victim;
import Manor.Bedroom;
import Suspects.*;

import javax.swing.*;

import static org.fusesource.jansi.Ansi.ansi;

import java.util.Base64;
import java.util.Scanner;

public class Victim {
    private static String murderer = "";
    static Scanner scanner;

    public Victim(String murderer) {
        this.murderer = "bmFubnk=\n";

    }

    public static void main(String[] args){
        scanner = new Scanner(System.in);
        System.out.println(ansi().fgBrightRed().bold().a("*** WHO KILLED MR.JAVAHART? *** ").reset().toString());
        System.out.println("Choose a number to proceed:\n1)accuse\n2)go-to\n3)talk-to");
        Integer choice = scanner.nextInt();

        while (true){
            switch (choice){
                case 1:
                    accuse();
                case 2:
                    goTo();
                case 3:
                    talkTo();
                default:
                    System.out.println("Invalid option..");

            }
        }

        if(accuse().equals(this.murderer)){
            System.out.println(ansi().fgBrightGreen().bold().a("CONGRATULATIONS DETECTIVE...They didn't do it alone though..").reset().toString());
        }else{
            System.out.println("You've got the wrong guy...");
        }

        String encodedLetter = "SSBhbSBzbyBzb3JyeSBteSBsb3ZlLCBJIGhhdmUgbWFkZSBhIGdyYXZlIG1pc3Rha2UuIERlc3BpdGUgbXkgcmVuZGV6dm91cyB3aXRoIHRoZSBuYW5ueSwgc2hlIGlzIG5vdGhpbmcgY29tcGFyZWQgdG8geW91LiBJIGxvdmUgeW91LiBTaGUgd2FzIG5vdCB5b3UuIEl0IHdhcyB0aGUgbmFubnkuIE15IGRheXMgd2VyZSBudW1iZXJlZC4=\n";


    }

    private static void goTo(){
        String prompt = "Where do you want to go?:\n1)The Bedroom\n2)The Garden\n3)The Kitchen\n4)The Library";
        String roomname = scanner.nextLine();
        switch(roomname){
            case "Bedroom":
//                Wife caught snooping around here on the Tuesday, by nanny
                break;
            case "Garden":
//                Encoded letter under a rock, placed by husband on the Monday
                break;
            case "Kitchen":
//                Baby saw chef chopping up tomatoes to prepare for the lunch on the Wednesday
                break;
            case "Library":
//                The overheard conversation was in here, on a Wednesday, by wife
                break;
        }
    }

    private static String talkTo(){

        System.out.println("Who do you want to talk to?:\n1)The baby\n2)The nanny\n3)The chef\n4)Mrs Javahart\n5)The Gardener");
        Integer suspect = scanner.nextInt();
        switch(suspect){
            case 1:
                return new BabyJavahart().clue();
            case 2:
                return new Nanny().clue();
            case 3:
                return new Chef().clue();
            case 4:
                return new MrsJavahart().clue();
            case 5:
                break;
            default:
                System.out.println("Check README.md for list of suspects");
        }
        return "";

    }

    private static String accuse(){
        System.out.println("Go ahead detective..who is it");
        String answer = scanner.nextLine();
        return answer;
    }
}
