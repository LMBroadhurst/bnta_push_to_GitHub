package enums;

public class EnumMain {

    public static void main(String[] args) {
        Person lewis = new Person("Lewis", "Birmingham", Month.NOVEMBER);
        Person justyna = new Person("Justyna", "Krakow", Month.JANUARY);
        Person sharon = new Person("Sharon", "Birmingham", Month.MAY);

//        Obviously this is the same person, but with the word November spelt incorrectly.
//        Enums help us to force the correct value into a data type.
//        Another example is the order status of buying something from eBay.

        System.out.println("Colin was born in month number " + lewis.getBirthMonth().);


    }

}
