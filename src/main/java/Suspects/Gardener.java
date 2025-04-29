package Suspects;

public class Gardener implements Suspects {
    @Override
    public String motive() {
        return "";
    }

    @Override
    public String clue() {
        return "The Chef invited me for lunch on Wednesday.";
    }

    public String[] gardener_dialogue(){

        return new String[]{
                "I can't keep this inside anymore... I love you.",
                "Then help me understand. Why are you pushing me away?",
                "Yours? But everyone thinks—",
                "You should have told me. You should have trusted me.",
                "It won’t. I’ll fix this. For you. For him."
        };
    }
}
