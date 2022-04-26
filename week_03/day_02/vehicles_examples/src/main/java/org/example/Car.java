package org.example;

public class Car implements Vehicle {
    @Override
    public String startEngine() {
        System.out.println("Look! A Human.");
        return "Look! A Human.";
    }

    public boolean isLightOn() {
        System.out.println("The light is off.");
        return false;
    }
}
