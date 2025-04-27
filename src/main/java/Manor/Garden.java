package Manor;

import Suspects.Gardener;
import Suspects.Nanny;
import org.fusesource.jansi.Ansi;

public class Garden {

    public Garden() {

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Ansi.ansi().fg(Ansi.Color.CYAN)
                .a("You learn that on Wednesday evening, Mrs. Javahart took a stroll through the gardens.\n")
                .a("Among the hedges, she caught fragmented voices — the gardener pleading, the nanny crying.\n")
                .a("Although she couldn't hear it all, the words 'baby' and 'can't leave it behind' stuck with her.\n")
                .a("Her mind raced. Had they betrayed her? Were they plotting something?\n")
                .a("That night, she began to watch everyone more closely...")
                .reset());



    }

    public static void PlayOutConvo() throws InterruptedException {
        Gardener gardener = new Gardener();
        for (int i = 0; i < gardener.gardener_dialogue().length; i++){
            System.out.println(gardener.gardener_dialogue()[i]);
            Thread.sleep(3000);
//            Fill in code to help you see the rest of the dialogue between the nanny and the gardener

        }

    }
}
