public class Artwork {

    private String title;
    private String artist;
    private int price;
    private String physical_nft;

    public Artwork(String title, String artist, int price, String physical_nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
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


//    Behaviours



}
