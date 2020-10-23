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

    @Test
    public void testPlayerCanScoreTwice() {
        Tennis tennis = new Tennis();
        tennis.score("player one");
        tennis.score("player one");
        assertEquals("Thirty-Love", tennis.getScore());
    }

    @Test
    public void testPlayerCanScoreThreeTimes() {
        Tennis tennis = new Tennis();
        tennis.score("player one");
        tennis.score("player one");
        tennis.score("player one");
        assertEquals("Forty-Love", tennis.getScore());
    }

    @Test
    public void testPlayerTwoCanScore() {
        Tennis tennis = new Tennis();
        tennis.score("player two");
        assertEquals("Love-Fifteen", tennis.getScore());
    }


    @Test
    public void testPlayerTwoCanScoreTwice() {
        Tennis tennis = new Tennis();
        tennis.score("player two");
        tennis.score("player two");
        assertEquals("Love-Thirty", tennis.getScore());
    }

    @Test
    public void testPlayerTwoCanScoreThreeTimes() {
        Tennis tennis = new Tennis();
        tennis.score("player two");
        tennis.score("player two");
        tennis.score("player two");
        assertEquals("Love-Forty", tennis.getScore());
    }

    @Test
    public void testBothPlayersCanScore() {
        Tennis tennis = new Tennis();
        tennis.score("player two");
        tennis.score("player two");
        tennis.score("player one");
        assertEquals("Fifteen-Thirty", tennis.getScore());
    }

    @Test
    public void testDeuce() {
        Tennis tennis = new Tennis();
        for (int i = 0; i < 3; i++)
        {
            tennis.score("player two");
            tennis.score("player one");

        }
        assertEquals("Deuce", tennis.getScore());
    }

    @Test
    public void testPlayerOneAdvantage() {
        Tennis tennis = new Tennis();
        for (int i = 0; i < 3; i++)
        {
            tennis.score("player two");
            tennis.score("player one");
        }
        tennis.score("player one");
        assertEquals("Advantage player one", tennis.getScore());
    }

    @Test
    public void testPlayerTwoAdvantage() {
        Tennis tennis = new Tennis();
        for (int i = 0; i < 3; i++)
        {
            tennis.score("player two");
            tennis.score("player one");
        }
        tennis.score("player two");
        assertEquals("Advantage player two", tennis.getScore());
    }

    @Test
    public void testDeuceAfterAdvantagePointSaved() {
        Tennis tennis = new Tennis();
        for (int i = 0; i < 4; i++)
        {
            tennis.score("player two");
            tennis.score("player one");
        }
        assertEquals("Deuce", tennis.getScore());
    }
}
