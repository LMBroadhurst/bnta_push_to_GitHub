import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void checkWalletBalance() {
//        Given
        Customer lewis = new Customer("Lewis", 100);

//        When

//        Then
        assertEquals(100, lewis.checkWalletBalance());
    }

    @Test
    void withdrawFromWalletTest() {
//        Given
        Customer lewis = new Customer("Lewis", 100);

//        When
        lewis.withdrawFromWallet(100);

//        Then
        assertEquals(0, lewis.getWallet());
    }

    @Test
    void depositToWallet() {
//        Given
        Customer lewis = new Customer("Lewis", 1000);

//        When
        lewis.depositToWallet(1000);

//        Then
        assertEquals(2000, lewis.getWallet());
    }

    @Test
    void buyArtFromGalleryTest() {

//        Given
        Gallery testGallery = new Gallery("testGal", 10000);
        Artwork testArtwork = new Artwork("testArt", "testArtist", 1000, "nft1");
        Customer testCustomer = new Customer("testCustomer", 2000);
//        When

        testCustomer.buyArtFromGallery(testGallery, testArtwork);

//        Then
        assertEquals("testArt", testCustomer.getOwned_art().get(0).getTitle());
        assertEquals(800, testCustomer.getWallet());
        assertEquals(11000, testGallery.getCashReserves());
//        How to test there is an empty array list?
        assertEquals(true, testGallery.getArtworks().isEmpty());
    }

    @Test
    void printOutCollectionTEst() {
        
    }
}