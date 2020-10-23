import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TennisTest {
    @Test
    public void testCanInstantiateTennisClass() {
        Tennis tennis = new Tennis();
        assertNotNull(tennis);
    }

    @Test
    public void testTennisCanReturnZeroScores() {
        Tennis tennis = new Tennis();
        assertEquals("Love-Love", tennis.getScore());
    }

    @Test
    public void testPlayerCanScore() {
        Tennis tennis = new Tennis();
        tennis.score("player one");
        assertEquals("Fifteen-Love", tennis.getScore());
    }

//    @Test
//    public void testPlayerCanScoreAgain() {
//        Tennis tennis = new Tennis();
//        tennis.score("player one");
//        tennis.score("player one");
//        assertEquals("Fifteen-Love", tennis.getScore());
//    }
}
