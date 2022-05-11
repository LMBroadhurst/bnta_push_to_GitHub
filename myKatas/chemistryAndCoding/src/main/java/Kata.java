import java.util.Locale;

public class Kata {

    public static boolean chemistryAndCoding(String solvent, String substrate) {

        boolean willItDissolve;
        solvent = solvent.toLowerCase();
        substrate = substrate.toLowerCase();

        if (solvent.equals(substrate)) {
            willItDissolve = true;
        } else {
            willItDissolve = false;
        }

        return willItDissolve;

    }

}
