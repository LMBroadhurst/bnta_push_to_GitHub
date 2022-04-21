package AlexLee_OOPJavaTutorial;

public class Headphones {

    String charger = "Micro usb";
    String[] controls = {"power", "play", "pause"};

    static boolean power = false;
    static int volume = 0;

    public static void powerOn() {
        power = true;
    }

    public static void powerOff() {
        power = false;
    }

    public static void volumeUp() {
        if (volume != 10) {
            volume++;
        } else {
            System.out.println("You are already at max volume.");
        }

    }

    public static void volumeDown() {
        if (volume != 0) {
            volume--;
        } else {
            System.out.println("Already at min volume.");
        }
    }

}
