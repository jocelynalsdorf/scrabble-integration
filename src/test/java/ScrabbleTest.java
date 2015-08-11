import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void scrabbleScore_returnsAscrabbleScoreForALetter_1() {
        Integer score = 2;
        assertEquals(score, Scrabble.getScore("g"));
    }

    @Test
    public void scrabbleScore_returnsAscrabbleScoreForASpace_0() {
        Integer score = 0;
        assertEquals(score, Scrabble.getScore(" "));
    }

    @Test
    public void scrabbleScore_returnsScoreSumForMutipleLetters_5() {
        Integer score = 5;
        assertEquals(score, Scrabble.getScore("dog"));
    }

    @Test
    public void scrabbleScore_ReturnsCorrectScoreRegardlessOfCase_5() {
        Integer score = 5;
        assertEquals(score, Scrabble.getScore("dOg"));
    }
}
