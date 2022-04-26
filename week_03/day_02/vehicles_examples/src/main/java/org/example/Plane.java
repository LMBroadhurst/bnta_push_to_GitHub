package org.example;

public class Plane implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Look! A Bird.");
        return "Look! A Bird.";
    }

    public void deployLandingGear() {
        System.out.println("Landing gear deployed.");
    }
}
