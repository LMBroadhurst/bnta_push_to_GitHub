import java.util.ArrayList;

public class Gallery {

    private String name;
    private int cashReserves;
    private ArrayList<Artwork> artworks;

    public Gallery(String name, int cashReserves) {
        this.name = name;
        this.cashReserves = cashReserves;
        this.artworks = new ArrayList<>();
    }

//    Getters and Setters

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCashReserves() {
        return this.cashReserves;
    }

    public void setCashReserves(int cashReserves) {
        this.cashReserves = cashReserves;
    }

    public ArrayList<Artwork> getArtworks() {
        return this.artworks;
    }

    public void setArtworks(ArrayList<Artwork> artworks) {
        this.artworks = artworks;
    }

//    Behaviours

    public void depositToCashReserve(int number) {
        this.cashReserves += number;
    }

    public void withdrawToBank(int number) {
        this.cashReserves -= number;
    }

    public void checkCashReserve() {
        System.out.println(this.cashReserves);
    }

    public void addNewArtwork(Artwork artwork) {
        this.artworks.add(artwork);
    }

    public void sellArtwork(Artwork artwork) {
        this.artworks.remove(artwork);
    }

    public void printOutCollection() {
        for (int i = 0; i < this.artworks.size(); i++) {
            System.out.println(artworks.get(i).getTitle());
        }
    }

    public void buyArtwork(Artwork artwork, Artist artist) {

    }

    public void stockTake() {
        int total = 0;
        for (int i = 0; i < this.artworks.size(); i++) {
            total += this.artworks.get(i).getPrice();
        }
        System.out.println(total);
    }
}
