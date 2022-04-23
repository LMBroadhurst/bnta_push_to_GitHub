import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GalleryTest {

    @Test
    void depositToCashReserve() {
//        Given
        Gallery testG = new Gallery("testG", 100);

//        When
        testG.depositToCashReserve(100);

//        Then
        assertEquals(200, testG.getCashReserves());
    }

    @Test
    void withdrawToBank() {
//        Given
        Gallery gTest = new Gallery("gTest", 100);

//        When
        gTest.withdrawToBank(100);

//        Then
        assertEquals(0, gTest.getCashReserves());
    }

    @Test
    void checkCashReserveTest() {
//        Given
        Gallery testGallery = new Gallery("test", 1000);

//        When

//        Then
        assertEquals(1000, testGallery.getCashReserves());
    }

    @Test
    void addNewArtworkTest() {
//        Given
        Gallery testG = new Gallery("testG", 1000);
        Artwork testA = new Artwork("testA", "a", 1, "a");

//        When
        testG.addNewArtwork(testA);

//        Then
        assertEquals("testA", testG.getArtworks().get(0).getTitle());
    }

    @Test
    void sellArtwork() {
//        Given
        Gallery tGal = new Gallery("tGal", 100);
        Artwork tArt = new Artwork("tArt", "a", 1, "a");
        tGal.addNewArtwork(tArt);

//        When
        tGal.sellArtwork(tArt);

//        Then
        assertEquals(true, tGal.getArtworks().isEmpty());
    }

    @Test
    void buyArtwork() {

    }

    @Test
    void stockTake() {
//        Given
        Artwork art1 = new Artwork("a", "a", 1, "a");
        Artwork art2 = new Artwork("a", "a", 1, "a");
        Artwork art3 = new Artwork("a", "a", 1, "a");

        Gallery testGal = new Gallery("a", 1);

//        When
        testGal.addNewArtwork(art1);
        testGal.addNewArtwork(art2);
        testGal.addNewArtwork(art3);

//        Then
        assertEquals(3, testGal.stockTake());
    }
}