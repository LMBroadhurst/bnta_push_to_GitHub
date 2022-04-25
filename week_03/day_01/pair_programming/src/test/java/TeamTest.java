import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamTest {
    private Team team;
    private Player player;
    private Manager manager;
    private Coach coach;

    @BeforeEach
    public void settup() {
        team = new Team("Liverpool", "You'll never walk alone.");
        player = new Player("Luis Diaz", 24, 100000, "Striker", 7, 0.72);
        manager = new Manager("Jurgen Klopp", 53, 10000, "Gegen Press", true);
        coach = new Coach("Pep Lindas", 40, 10000, 0.01, "Striker");
    }

    @Test
    void testAdd() {
        team.addEmployee(player);
        team.addEmployee(manager);
        team.addEmployee(coach);
        assertEquals(3, team.getEmployees().size());
    }


}
