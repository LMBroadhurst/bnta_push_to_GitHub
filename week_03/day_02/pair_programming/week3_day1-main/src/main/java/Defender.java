public class Defender extends Player implements Tackles{

    public Defender(String name, int age, int wage, int goalsScored, double shootingAccuracy) {
        super(name, age, wage, goalsScored, shootingAccuracy);
    }

    @Override
    public String tackle() {
        return "Slide Tackle.";
    }

}
