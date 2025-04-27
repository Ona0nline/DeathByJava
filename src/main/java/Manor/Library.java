package Manor;

import org.fusesource.jansi.Ansi;

public class Library {

    public static void main(String[] args) {
        System.out.println();
    }

    public void bookshelf() {
        System.out.println(Ansi.ansi().fgBrightRed().bold().a("Behind this bookshelf lies the murder weapon.\n" +
                "Each title is followed by a number, formatted as 'Title - ISBN7'.\n" +
                "The number represents the ID of the book and also tells you how many spaces from the start\n" +
                "of the title to count to reveal a letter. The final word revealed will uncover the murder weapon."));

        System.out.println(Ansi.ansi().fgBrightRed().bold().a("You can decide what to do with this information...").reset());
    }
}
