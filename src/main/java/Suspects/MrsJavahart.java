package Suspects;
//Mrs Javahart motive = money, she didn't do it though
public class MrsJavahart implements Suspects {

    @Override
    public String clue() {
        return "Mr Javahart loved taking long walks in the garden.";
    }

    @Override
    public String motive() {
        return "";
    }
}
