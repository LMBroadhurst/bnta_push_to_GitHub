import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CohortTest {

//    Instead of instantiating a cohort object for every test...

    private Cohort cohort;

    @BeforeEach
    void setup() {
        cohort = new Cohort("Test Cohort");
    }

    @Test
    void startsWithNoStudents() {

//        We should test this because we want to know we have an array list initialised.
//        We also want to see that the array list is empty, ensuring we have nothing in the array list when we
//        add the student objects.

//        Given
//        Cohort cohort = new Cohort("test cohort");

//        When

//        Then - it should have no students
        assertEquals(0, cohort.countStudents());

    }

    @Test
    void canAddStudent() {
//        Given - a new cohort and a student

//        Cohort cohort = new Cohort("test cohort");
        Student student2 = new Student("Lewis", 21, "Solihull", "Leeds");

//        When - we add the student to the cohort
        cohort.addNewStudent(student2);

//        Then - the cohort should have one student in it
        assertEquals(1, cohort.countStudents());
    }

}
