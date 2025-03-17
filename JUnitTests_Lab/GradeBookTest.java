import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
    private GradeBook grade1;
    private GradeBook grade2;

    @BeforeEach
    public void setUp() throws Exception {
        grade1 = new GradeBook(5);
        grade1.addScore(50);
        grade1.addScore(75);

        grade2 = new GradeBook(5);
        grade2.addScore(80);
        grade2.addScore(90);
        grade2.addScore(85); 
    }

    @AfterEach
    public void tearDown() throws Exception {
        grade1 = null;
        grade2 = null;
    }

    @Test
    public void testAddScore() {
        assertTrue(grade1.toString().equals("50.0 75.0"));
        assertEquals(2, grade1.getScoreSize());

        assertTrue(grade2.toString().equals("80.0 90.0 85.0"));
        assertEquals(3, grade2.getScoreSize());
    }

    @Test
    public void testSum() {
        assertEquals(125, grade1.sum(), 0.0001);
        assertEquals(255, grade2.sum(), 0.0001);
    }

    @Test
    public void testMinimum() {
        assertEquals(50, grade1.minimum(), 0.001);
        assertEquals(80, grade2.minimum(), 0.001);
    }

    @Test
    public void testFinalScore() {
        assertEquals(75, grade1.finalScore(), 0.001);
        assertEquals(175, grade2.finalScore(), 0.001);
    }

   
}