package AlexLee_OOPJavaTutorial;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Pen p = new Pen();

        out.println(p.colour);
        out.println(p.point);
        out.println(p.type);

        out.println(p.clicked);

        p.click();

        out.println(p.clicked);

        Headphones h = new Headphones();

        for (int i = 0; i < 12; i++) {
            String charger = h.charger;
            h.volumeUp();

        }
    }

}
