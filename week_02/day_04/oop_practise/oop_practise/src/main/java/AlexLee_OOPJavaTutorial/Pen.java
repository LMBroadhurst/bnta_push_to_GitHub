package AlexLee_OOPJavaTutorial;

public class Pen {

    public boolean click;
    public boolean unclick;
    String type = "gel";
    String colour = "Blue";
    int point = 10;
    
    static boolean clicked = false;
    
    public static void click() {
        clicked = true;
    }
    
    public static void unclick() {
        clicked = false;
    }
}
