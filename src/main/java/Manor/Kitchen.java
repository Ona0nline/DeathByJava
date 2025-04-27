package Manor;

import org.fusesource.jansi.Ansi;

import java.util.Base64;
import java.util.Scanner;

import static org.fusesource.jansi.Ansi.ansi;

public class Kitchen {
    private String recipe;

    public Kitchen() {
        this.recipe = "Spaghetti Bolognese\nIngredients:\nTomatoes, Mince, Red Wine, Olive Oil, Garlic, Basil\n";
    }

    public String Knife() {
        return "You find a knife, smeared with a red substance..";

    }

    public String fridge() {
        return "You find sliced tomatoes in the fridge.";

    }

    public String stove() {
        return "You find two pots of mince.";

    }

    public String cabinetcode(){
        System.out.println(
                ansi().a("You find a recipe for last night's dinner that was served to Mr. Javahart.\n" +
                                "It has all but one ingredient on it.\n" +
                                "The missing ingredient is the key to unlocking the cabinet:\n\n") // extra \n for a gap
                        .bgMagenta().a("\t\t") // tab spaces to "center" it a little
                        .a(ansi().a("\u001B[3m")) // ANSI italic start
                        .a(this.recipe)
                        .a("\u001B[0m") // ANSI italic end
                        .reset()
        );


        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess: ");
        String guess = scanner.nextLine().toLowerCase();
        byte[] decodedBytes = Base64.getDecoder().decode("c3BhZ2hldHRp");
        String decodedString = new String(decodedBytes);
        if (!guess.equals(decodedString)){
            return "Think..starch";
        }else{
            System.out.println("Open sesame! You find a note...");
            byte[] decoded = Base64.getDecoder().decode("VGhlIHF1aWV0IHNoZWxmIGhvbGRzIG1vcmUgdGhhbiBsb3JlLApBIHZpYWwgd2FpdHMgYmVoaW5kIGEgZG9vci4=");
            return new String(decoded);
        }
    }


}
