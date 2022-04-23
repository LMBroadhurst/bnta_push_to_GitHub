import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtistTest {

    @Test
    void addArtToArtist() {
//        Given
        Artwork art1 = new Artwork("abc", "b", 1, "c");
        Artist artist1 = new Artist("a", "a", 1);

//        When
        artist1.AddArtToArtist(art1);

//        Then
        assertEquals("abc", artist1.getPortfolio().get(0).getTitle());

    }

    @Test
    void sellToGallery() {
//        Given
        Artwork art1 = new Artwork("abc", "b", 1, "c");
        Artist artist1 = new Artist("a", "a", 1);
        Gallery gallery1 = new Gallery("test", 100);

        artist1.AddArtToArtist(art1);

//        When
        artist1.sellToGallery(art1, gallery1);

//        Then
        assertEquals(true, artist1.getPortfolio().isEmpty());
        assertEquals("abc", gallery1.getArtworks().get(0).getTitle());
        assertEquals(2, artist1.getWallet());
        assertEquals(99, gallery1.getCashReserves());
    }
}