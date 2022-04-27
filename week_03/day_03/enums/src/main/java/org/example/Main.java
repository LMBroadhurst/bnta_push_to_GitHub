package org.example;

public class Main {

    public static void main(String[] args) {

//        Check enum using if

        Season season = Season.SUMMER;

        if (season == Season.SPRING) {
            System.out.println("Spring Time :)");
        } else if (season == Season.SUMMER) {
            System.out.println("Summer :)");
        }

//        Check enum using switch

        switch (season) {
            case SPRING:
                System.out.println("Spring.");
                break;
            case SUMMER:
                System.out.println("Summer time.");
                break;
            case FALL:
                System.out.println("Fall time.");
                break;
            case WINTER:
                System.out.println("Winter is coming.");
            default:
                System.out.println("I don't recognise this season.");
        }

    }

}
