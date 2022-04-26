import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void settup() {
        player = new Defender("Stephen Kingsley", 26, 5000,  12, 0.15);
    }

    @Test
    void testName() {
        assertEquals("Stephen Kingsley", player.getName());
    }


    @Test
    void shoot_lower() {
//        Given

//        When
        if(0.1 < player.getShootingAccuracy()) {
            this.player.setGoalsScored(player.getGoalsScored() + 1);
        }

//        Then

        assertEquals(13, player.getGoalsScored());
    }

    @Test
    void shoot_higher() {
//        Given

//        When
        if(0.2 < player.getShootingAccuracy()) {
            this.player.setGoalsScored(player.getGoalsScored() + 1);
        }

//        Then

        assertEquals(12, player.getGoalsScored());
    }

    @Test
    void testShoot__lower() {
//        Given

//        When
        if((0.05 * 2 ) < player.getShootingAccuracy()) {
            this.player.setGoalsScored(player.getGoalsScored() + 1);
        }

//        Then
        assertEquals(13, player.getGoalsScored());
    }

    @Test
    void testShoot__higher() {
//        Given

//        When
        if((0.2 * 2 ) < player.getShootingAccuracy()) {
            this.player.setGoalsScored(player.getGoalsScored() + 1);
        }

//        Then
        assertEquals(12, player.getGoalsScored());
    }
}
