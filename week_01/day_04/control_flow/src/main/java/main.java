public class main {

    public static void main(String[] args) {
        int priceOfBook = 5;
        int amountInWallet = 400;
        int booksInStock = 0;

        if (priceOfBook <= amountInWallet && booksInStock > 0) {
            System.out.println("You have enough to pay for the book.");
            System.out.println("Thanks for payment.");
        } else if (booksInStock == 0) {
            System.out.println("Sorry, that book is not in stock.");
        } else {
            System.out.println("You do not have enough money in your wallet.");
        }
    }
}
