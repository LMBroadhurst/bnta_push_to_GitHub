package org.example;

public class Boat implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Look! A Dolphin.");
        return "Look! A Dolphin.";
    }

    public String raiseTheSail() {
        String msg = "The sail is up!";
        System.out.println(msg);

        return msg;
    }

    private void doSth() {

    }
}
