package afterHoursPractise;

public abstract class  ComputerComponents {

    private int price;
    private String name;
    private boolean newOrUsed;

    public ComputerComponents(int price, String name, boolean newOrUsed) {
        this.price = price;
        this.name = name;
        this.newOrUsed = newOrUsed;
    }

//    Getters and Setters

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNewOrUsed() {
        return this.newOrUsed;
    }

    public void setNewOrUsed(boolean newOrUsed) {
        this.newOrUsed = newOrUsed;
    }

//    Behaviours

    public void turnOn() {
        System.out.println(this.name + " has been turned on.");
    }

    public void turnOff() {
        System.out.println(this.name + " has been turned off.");
    }
}
