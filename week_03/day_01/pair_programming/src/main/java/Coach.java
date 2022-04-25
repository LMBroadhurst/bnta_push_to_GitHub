public class Coach extends FootballEmployee{

    private double trainingGain;
    private String trainingPosition;

    public Coach(String name, int age, int wage, double trainingGain, String trainingPosition) {
        super(name, age, wage);
        this.trainingGain = trainingGain;
        this.trainingPosition = trainingPosition;
    }

    public double getTrainingGain() {
        return trainingGain;
    }

    public void setTrainingGain(int trainingGain) {
        this.trainingGain = trainingGain;
    }

    public String getTrainingPosition() {
        return trainingPosition;
    }

    public void setTrainingPosition(String trainingPosition) {
        this.trainingPosition = trainingPosition;
    }

    public void train(Player player) {
        if(player.getPosition() == this.trainingPosition) {
            player.setShootingAccuracy(player.getShootingAccuracy() + this.trainingGain);
        }
    }

}
