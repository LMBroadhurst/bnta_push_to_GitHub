import java.util.ArrayList;

public class Customer {

    private String name;
    private int wallet;
    private ArrayList<Artwork> owned_art;

    public Customer(String name, int wallet) {
        this.name = name;
        this.wallet = wallet;
        this.owned_art = new ArrayList<>();
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

    public ArrayList<Artwork> getOwned_art() {
        return this.owned_art;
    }

    public void setOwned_art(ArrayList<Artwork> owned_art) {
        this.owned_art = owned_art;
    }

//    Behaviours

    public void depositToWallet(int number) {
        this.wallet += number;
    }

    public void withdrawFromWallet(int number) {
        this.wallet -= number;
    }

    public int checkWalletBalance() {
        return (this.wallet);
    }

    public void buyArtFromGallery(Gallery gallery, Artwork artwork) {
        this.owned_art.add(artwork);
        this.wallet -= artwork.getPrice() * 1.2;
        gallery.depositToCashReserve(artwork.getPrice());
        gallery.sellArtwork(artwork);
    }

    public void printOutCollection() {
        for (int i = 0; i < this.owned_art.size(); i++) {
            System.out.println(owned_art.get(i).getTitle());
        }
    }

}
