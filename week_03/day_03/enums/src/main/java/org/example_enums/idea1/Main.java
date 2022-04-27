package org.example_enums.idea1;

public class Main {

    public static void main(String[] args) {

        DaysOfWeek daysOfWeek = DaysOfWeek.SATURDAY;

//        Enum with if

        if (daysOfWeek == DaysOfWeek.THURSDAY) {
            System.out.println("Rebecca Black taught me that this day is before friday.");
        } else if (daysOfWeek == DaysOfWeek.SATURDAY) {
            System.out.println("Rebecca Black taught me this day is after Saturday.");
        } else if (daysOfWeek == DaysOfWeek.SUNDAY) {
            System.out.println("5 days of freedom from Rebecca Black");
        } else if (daysOfWeek == DaysOfWeek.MONDAY) {
            System.out.println("4 days of freedom from Rebecca Black");
        } else if (daysOfWeek == DaysOfWeek.TUESDAY) {
            System.out.println("3 days of freedom from Rebecca Black");
        } else if (daysOfWeek == DaysOfWeek.WEDNESDAY) {
            System.out.println("2 days of freedom from Rebecca Black");
            System.out.println("Ooops, accidentally going to jump off a cliff.");
        }

//        Enum with switch

        switch (daysOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Weekday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("This isn't a day of the week.");
        }
    }



}
