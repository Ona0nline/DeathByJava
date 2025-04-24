package Suspects;
//Gardener was on the grounds on a day he wasn't supposed to be, claims he came over for tea with the chef...sus, chef "forgot" to mention that
public class Gardener extends Suspects {
    @Override
    public String motive() {
        return "";
    }

    @Override
    public String clue() {
        return "The Chef invited me for lunch on Wednesday.";
    }
}
