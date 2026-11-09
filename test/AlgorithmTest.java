import algorithm.Algorithm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {
    @Test
    public void testThatMethodSquareOfNumbersWorks(){
        int [] arrays = {3,2,7,1,4};
        int [] actual = Algorithm.squareOfNumbers(arrays);
        int [] expected = {1,4,9,16,49};
        assertArrayEquals(actual, expected);
    }

    @Test
    public void testThatMethodShortestWordGetsTheShortestWord(){
        String words = "Are you coming from the island . eh";
        String actual = Algorithm.shortestWord(words);
        assertEquals("eh", actual);
    }

}
