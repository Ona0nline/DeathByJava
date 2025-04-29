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


    }

    public static void main(String[] args) throws InterruptedException {
        scanner = new Scanner(System.in);
        System.out.println(ansi().fgBrightRed().bold().a("*** WHO KILLED MR.JAVAHART? *** ").reset().toString());

        boolean keepGoing = true;
        while (keepGoing){
            keepGoing = main_menu();
        }


    }

    private static boolean main_menu() throws InterruptedException {
        System.out.println("Choose a number to proceed:\n1)accuse\n2)go-to\n3)talk-to\n4)main menu\n5)I need a break!");
        Integer choice = scanner.nextInt();
        scanner.nextLine();
        boolean exit = true;

        while (exit){
            switch (choice){
                case 1 -> {
                    accuse();
                    System.exit(0);
                }
                case 2 ->{System.out.println(goTo());}
                case 3 -> {System.out.println(talkTo());}
                case 4 ->{System.out.println(main_menu());}
                case 5 -> {
                    System.out.println("\nDetective sighs... It's been a long case.");
                    Thread.sleep(1000);
                    System.out.println("The manor doors creak open as you step out.");
                    Thread.sleep(2000);
                    System.out.println("You're not sure if you'll ever forget what happened here...");
                    Thread.sleep(1500);
                    System.out.println(ansi().fgBrightBlue().bold().a("\nGAME OVER.").reset());
                    Thread.sleep(1000);
                    System.exit(0);

                }

                default -> System.out.println("Invalid option..");


            }
        }
        return true;


    }

    private static String goTo() throws InterruptedException {
        System.out.println("Where do you want to go?:\n1)The Bedroom\n2)The Garden\n3)The Kitchen\n4)The Library\n5)main menu");
        Integer choice = scanner.nextInt();

        boolean exit_inner = true;
        while (exit_inner){
            switch(choice){
                case 1 ->{
                    return ansi().fgBrightYellow().bold().a("Physically go and visit the bedroom.").reset().toString();
                }
                case 2 ->{
                    return ansi().fgBrightYellow().bold().a("Physically go and visit the garden.").reset().toString();
                }
                case 3 ->{
                    System.out.println(ansi().fgBrightYellow().bold().a("You can interact with kitchen methods right here.").reset().toString());
                    Kitchen kitchen = new Kitchen();
                    System.out.println(kitchen.cabinetcode());

                }

                case 4 -> {
//                    Hint check the resources package
                    return ansi().fgBrightYellow().bold().a("You can interact with library methods right here.").reset().toString();
                }
                case 5 ->{
                    main_menu();
                    exit_inner = false;
                }
                default -> System.out.println("Check README.md for list of areas");
            }

        }
        return "";
        }


    private static String talkTo() throws InterruptedException {

        System.out.println("Who do you want to talk to?:\n1)The baby\n2)The nanny\n3)The chef\n4)Mrs Javahart\n5)The Gardener\n6)main menu");
        Integer suspect = scanner.nextInt();

        boolean exit_inner = true;
        while (exit_inner){

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
                case 6 ->{
                    main_menu();
                    exit_inner = false;
                }

                default -> System.out.println("Check README.md for list of suspects");


            }

        }
        return "";

    }

    private static Clues accuse(){
        System.out.println("Go ahead detective...hand over the case you have built");
        Clues report = new Clues();
        return report;
    }
}
