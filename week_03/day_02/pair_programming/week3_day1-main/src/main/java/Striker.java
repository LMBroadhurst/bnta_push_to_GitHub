public class Striker extends Player implements Shooters{

    public Striker(String name, int age, int wage, int goalsScored, double shootingAccuracy) {
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

}
