import java.util.Locale;

public class Kata {

    public static boolean chemistryAndCoding(String solvent, String solute) {

            boolean willItDissolve;
            solvent = solvent.toLowerCase();
            solute = solute.toLowerCase();

            if (solvent.equals(solute)) {
                willItDissolve = true;
            } else {
                willItDissolve = false;
            }

            return willItDissolve;
    }
}
