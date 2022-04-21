package tdd_codingbat_diff21;

public class Diff21Test {

    public int Diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

}
