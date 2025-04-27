package Suspects;

import org.fusesource.jansi.Ansi;

import java.util.ArrayList;

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

    public ArrayList<String> scrambled_conversation(){
        System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).a("\"You got the baby to reiterate what he heard on the Wednesday before his father's passing - but it's all scrambled... he's just a baby.").reset());
        String[] conversation = {
                "Chef: 'I don’t know... but I’ll do it.'",
                "Gardener: 'You have to. For her sake.'",
                "Chef: 'But why? What’s going on?'",
                "Gardener: 'You don’t get it. She’s scared. She needed someone to help her.'",
                "Chef, while chopping tomatoes: 'So you want me to just... help her? After everything?'",
                "Gardener: 'You have to do it... for her!'"
        };
//        Reorder the conversation
        return new ArrayList<>();

    }
}

