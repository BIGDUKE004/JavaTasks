import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LettersTest{

    @Test
        public void countNumbers(){
int actual = Letters.countLetters("mymomisthebestintheworld");
int expected = 24;
assertEquals(actual, expected);
}

}
