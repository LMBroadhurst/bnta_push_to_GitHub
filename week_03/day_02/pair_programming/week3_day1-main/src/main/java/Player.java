public abstract class Player extends FootballEmployee {


    protected int goalsScored;
    protected double shootingAccuracy;

    public Player(String name, int age, int wage, int goalsScored, double shootingAccuracy) {
        super(name, age, wage);
        this.goalsScored = goalsScored;
        this.shootingAccuracy = shootingAccuracy;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public double getShootingAccuracy() {
        return shootingAccuracy;
    }

    public void setShootingAccuracy(double shootingAccuracy) {
        this.shootingAccuracy = shootingAccuracy;
    }


}
