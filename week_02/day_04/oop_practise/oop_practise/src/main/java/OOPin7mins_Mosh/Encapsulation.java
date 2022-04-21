package OOPin7mins_Mosh;

public class Encapsulation {

    int baseSalary = 30000;
    int overtime = 10;
    int rate = 20;

    public int getWage() {
        return this.baseSalary + (this.overtime * this.rate);
    }
}
