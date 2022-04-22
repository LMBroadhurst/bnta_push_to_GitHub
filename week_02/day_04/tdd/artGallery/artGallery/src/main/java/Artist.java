import java.util.ArrayList;

public class Artist {

    private String name;
    private ArrayList<Artwork> portfolio;
    private int wallet;

    public Artist(String name, String portfolio, int wallet) {
        this.name = name;
        this.portfolio = new ArrayList<>();
        this.wallet = wallet;
    }

//  Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artwork> getPortfolio() {
        return this.portfolio;
    }

    public void setPortfolio(ArrayList<Artwork> portfolio) {
        this.portfolio = portfolio;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

//    Behaviours

    public void AddArtToArtist(Artwork artwork) {
        this.portfolio.add(artwork);
    }

    public void sellToGallery(Artwork artwork, Gallery gallery) {
        this.portfolio.remove(artwork);
        gallery.addNewArtwork(artwork);
        wallet += artwork.getPrice();
        gallery.withdrawToBank(artwork.getPrice());
    }
}
