package Suspects;

//Nanny will point to baby saying it said something suspicious..
public class Nanny implements Suspects {

    public String clue() {
        return "The baby has been crying all morning about the chef. I also saw Mrs. Javahart snooping around in the safe in the bedroom...";
    }

    @Override
    public String motive() {
        return "";
    }
}
