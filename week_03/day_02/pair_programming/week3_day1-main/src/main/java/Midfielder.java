public class Midfielder extends Player implements Shooters, Tackles {

    public Midfielder(String name, int age, int wage, int goalsScored, double shootingAccuracy) {
        super(name, age, wage, goalsScored, shootingAccuracy);
    }

    public void shoot() {
        if(Math.random() < shootingAccuracy) {
            this.goalsScored++;
        }
    }

    public void shoot(boolean isPenalty) {
        if((Math.random() * 2 ) < shootingAccuracy) {
            this.goalsScored++;
        }
    }

    @Override
    public String tackle() {
        return "Standing up tackle.";
    }

}
