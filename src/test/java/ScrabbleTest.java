import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void scrabbleScore_returnsAscrabbleScoreForALetter_1() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 2;
        assertEquals(score, testScrabble.getScore("g"));
    }

    @Test
    public void scrabbleScore_returnsAscrabbleScoreForASpace_0() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 0;
        assertEquals(score, testScrabble.getScore(" "));
    }

    @Test
    public void scrabbleScore_returnsScoreSumForMutipleLetters_5() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 5;
        assertEquals(score, testScrabble.getScore("dog"));
    }

    @Test
    public void scrabbleScore_ReturnsCorrectScoreRegardlessOfCase_5() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 5;
        assertEquals(score, testScrabble.getScore("dOg"));
    }
}
