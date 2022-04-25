public class Player extends FootballEmployee {

    private String position;
    private int goalsScored;
    private double shootingAccuracy;

    public Player(String name, int age, int wage, String position, int goalsScored, double shootingAccuracy) {
        super(name, age, wage);
        this.position = position;
        this.goalsScored = goalsScored;
        this.shootingAccuracy = shootingAccuracy;
    }

    public void shoot() {
        if(Math.random() < shootingAccuracy) {
            this.goalsScored++;
        }
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
