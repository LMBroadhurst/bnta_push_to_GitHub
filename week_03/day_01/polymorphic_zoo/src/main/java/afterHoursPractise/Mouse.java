package afterHoursPractise;

public class Mouse extends ComputerComponents {

    private int speedOfMouse;
    private String mouseType;

    public Mouse(int price, String name, boolean newOrUsed, int speedOfMouse, String mouseType) {
        super(price, name, newOrUsed);

        this.mouseType = mouseType;
        this.speedOfMouse = speedOfMouse;
    }

//    Getters and Setters


    public int getSpeedOfMouse() {
        return this.speedOfMouse;
    }

    public void setSpeedOfMouse(int speedOfMouse) {
        this.speedOfMouse = speedOfMouse;
    }

    public String getMouseType() {
        return this.mouseType;
    }

    public void setMouseType(String mouseType) {
        this.mouseType = mouseType;
    }

//    Behaviours

    public String click() {
        return "Click!";
    }

}
