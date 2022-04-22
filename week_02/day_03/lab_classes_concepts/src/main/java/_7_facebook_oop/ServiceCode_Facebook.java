package _7_facebook_oop;

public class ServiceCode_Facebook {

    public String name = "Lewis Broadhurst";
    public int age = 27;
    public String job = "Bootcamp Trainee";

    public boolean openAccount() {
        System.out.println("You have opened an account with facebook, " + name + ".");
        return true;
    }

    public String postStatus() {
        return "Enter horribly cringey post from 200X here.";
    }

    private boolean blockUser() {
        System.out.println("Would you like to block _____?");
        return true;
    }

}
