package Suspects;
//Gardener was on the grounds on a day he wasn't supposed to be, claims he came over for tea with the chef...sus, chef "forgot" to mention that
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
