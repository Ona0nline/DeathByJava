package Suspects;


public class Nanny implements Suspects {

    public String clue() {
        return "The baby has been crying all morning about the chef. I also saw Mrs. Javahart snooping around in the safe in the bedroom on Wednesday evening...";
    }

    @Override
    public String motive() {
        return "";
    }

    public String[] nanny_dialogue(){

        return new String[]{
                "Please... you don't understand. It's not that simple.",
                "Because... because the baby... he’s mine.",
                "I know. I had no choice. I couldn't let them find out.",
                "I was scared. I still am. Everything could fall apart.",
                ""

        };
    }
}
