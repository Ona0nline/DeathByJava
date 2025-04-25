package Suspects;

//Will Babble a clue, pointing to chef
public class BabyJavahart implements Suspects {

    @Override
    public String clue() {
        return "HE STABBED IT! IT WAS OOZING RED! THE CHEF!";
    }

    @Override
    public String motive() {
        return "I'M JUST A BABY";
    }
}

