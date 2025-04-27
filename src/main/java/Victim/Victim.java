package Victim;
import Manor.Kitchen;
import Manor.Library;
import Suspects.*;

import static org.fusesource.jansi.Ansi.ansi;

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

        while (true){
            main_menu();
        }
//        String encodedLetter = "SSBhbSBzbyBzb3JyeSBteSBsb3ZlLCBJIGhhdmUgbWFkZSBhIGdyYXZlIG1pc3Rha2UuIERlc3BpdGUgbXkgcmVuZGV6dm91cyB3aXRoIHRoZSBuYW5ueSwgc2hlIGlzIG5vdGhpbmcgY29tcGFyZWQgdG8geW91LiBJIGxvdmUgeW91LiBTaGUgd2FzIG5vdCB5b3UuIEl0IHdhcyB0aGUgbmFubnkuIE15IGRheXMgd2VyZSBudW1iZXJlZC4=\n";

    }

    private static String main_menu(){
        System.out.println("Choose a number to proceed:\n1)accuse\n2)go-to\n3)talk-to\n4)main menu");
        Integer choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice){
            case 1 -> {
                accuse();
                if(accuse().equals(murderer)){
                    System.out.println(ansi().fgBrightGreen().bold().a("CONGRATULATIONS DETECTIVE...They didn't do it alone though..").reset().toString());
                }else{
                    System.out.println("You've got the wrong guy...");
                }
            }
            case 2 ->{System.out.println(goTo());}
            case 3 -> {System.out.println(talkTo());}
            case 4 ->{System.out.println(main_menu());}

            default -> System.out.println("Invalid option..");


        }
        return "main menu";
    }

    private static String goTo(){
        System.out.println("Where do you want to go?:\n1)The Bedroom\n2)The Garden\n3)The Kitchen\n4)The Library");
        String roomname = scanner.nextLine().toLowerCase();
        while (true){
            switch(roomname){
                case "bedroom" ->{
                    return ansi().fgBrightYellow().bold().a("Physically go and visit the bedroom.").reset().toString();
                }
                case "garden" ->{
                    return ansi().fgBrightYellow().bold().a("Physically go and visit the garden.").reset().toString();
                }
                case "kitchen" ->{
                    System.out.println(ansi().fgBrightYellow().bold().a("You can interact with kitchen methods right here.").reset().toString());
                    Kitchen kitchen = new Kitchen();
                    System.out.println(kitchen.cabinetcode());

                }

                case "library" -> {
//                    Hint check the resources package
                    return ansi().fgBrightYellow().bold().a("You can interact with library methods right here.").reset().toString();
                }
                default -> System.out.println("Check README.md for list of areas");
            }
            return "";
        }
        }


    private static String talkTo(){

        System.out.println("Who do you want to talk to?:\n1)The baby\n2)The nanny\n3)The chef\n4)Mrs Javahart\n5)The Gardener");
        Integer suspect = scanner.nextInt();

        while (true){

            switch(suspect){
                case 1 -> {
                    return ansi().fgBrightYellow().bold().a(new BabyJavahart().clue()).reset().toString();
                }

                case 2 -> {
                    return ansi().fgBrightYellow().bold().a(new Nanny().clue()).reset().toString();
                }
                case 3 ->{
                    return ansi().fgBrightYellow().bold().a(new Chef().clue()).reset().toString();
                }

                case 4 -> {return ansi().fgBrightYellow().bold().a(new MrsJavahart().clue()).reset().toString();}


                case 5 -> {
                    return ansi().fgBrightYellow().bold().a(new Gardener().clue()).reset().toString();
                }

                default -> System.out.println("Check README.md for list of suspects");

            }
            return "";
        }


    }

    private static String accuse(){
        System.out.println("Go ahead detective..who is it");
        String answer = scanner.nextLine();
        return answer;
    }
}
