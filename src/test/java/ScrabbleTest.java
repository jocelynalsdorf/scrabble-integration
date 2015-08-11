import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

    @Test
    public void scrabbleScore_returnsAscrabbleScoreForALetter_1() {
        Scrabble testScrabble = new Scrabble();
        Integer score = 1;
        assertEquals(score, testScrabble.getScore("a"));
    }
}
