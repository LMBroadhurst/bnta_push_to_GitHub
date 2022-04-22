import org.junit.jupiter.api.Test;

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
}