package afterHoursPractise;

import animals.Animal;

public class Monitor extends ComputerComponents {

    private int size;
    private boolean curved;
    private int brightness;

    public Monitor(int price, String name, boolean newOrUsed, int size, boolean curved, int brightness) {

        super(price, name, newOrUsed);

        this.size = size;
        this.curved = curved;
        this.brightness = brightness;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isCurved() {
        return this.curved;
    }

    public void setCurved(boolean curved) {
        this.curved = curved;
    }

    public int getBrightness() {
        return this.brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

//    Behaviours

    public void brightnessUp(int increment) {
        if (this.brightness + increment < 100) {
            this.brightness += increment;
        } else {
            System.out.println("Max brightness is 100. Currently the volume is " + this.getBrightness() + ". Please choose a lower value.");
        }

    }

    public void brightnessDown(int increment) {
        if (this.brightness - increment < 0) {
            System.out.println("Min volume is 0. Current volume is " + this.getBrightness() + ". Please choose a lower value.");
        } else {
            this.brightness -= increment;
        }
    }


}
