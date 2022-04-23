import java.util.ArrayList;

public class Artwork {

    private String title;
    private String artist;
    private int price;
    private String physical_nft;
    private ArrayList<Artwork> all_artwork;
    private int nft_code;


    public Artwork(String title, String artist, int price, String physical_nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft_code = uniqueNFT();
        this.physical_nft = physical_nft;

    }

//    Getters and Setters

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhysical_nft() {
        return this.physical_nft;
    }

    public void setPhysical_nft(String physical_nft) {
        this.physical_nft = physical_nft;
    }

    public ArrayList<Artwork> getAll_artwork() {
        return this.all_artwork;
    }

    public void setAll_artwork(ArrayList<Artwork> all_artwork) {
        this.all_artwork = all_artwork;
    }

    public int getNft_code() {
        return this.nft_code;
    }

    public void setNft_code(int nft_code) {
        this.nft_code = nft_code;
    }

//    Behaviours

    public int uniqueNFT() {
      this.all_artwork.add(this);
        return this.nft_code = all_artwork.size();
    }

    public void addToArtUniverse(Artwork artwork) {
        this.all_artwork.add(artwork);
    }


}
