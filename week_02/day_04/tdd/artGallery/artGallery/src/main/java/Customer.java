public class Customer {

    private String name;
    private int wallet;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
    }

//    Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

//    Behaviours

    public void depositToWallet(int number) {
        this.wallet += number;
    }

    public void withdrawFromWallet(int number) {
        this.wallet -= number;
    }

    public void checkWalletBalance() {
        System.out.println(this.wallet);
    }

}
