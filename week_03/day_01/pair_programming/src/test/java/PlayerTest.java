import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    private Player player;

    @BeforeEach
    public void settup() {
        player = new Player("Stephen Kingsley", 26, 5000, "Defender", 12, 0.15);
    }

    @Test
    void testName() {
        assertEquals("Stephen Kingsley", player.getName());
    }


}
