package enums;

public enum Month {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private final int monthNumber;

    Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getMonthNumber() {
        return this.monthNumber;
    }

//    public void setMonthNumber(int monthNumber) {
//        this.monthNumber = monthNumber;
//    }

//    Since we have set our birth month as "Final" - we cannot have a setter as this would change the month value.
}
