public class Goalkeepers extends Player implements Tackles{

    public Goalkeepers(String name, int age, int wage, int goalsScored, double shootingAccuracy) {
        super(name, age, wage, goalsScored, shootingAccuracy);
    }

    @Override
    public String tackle() {
        return "Great Save.";
    }
}
