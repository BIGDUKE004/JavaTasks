import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenTest{

    @Test
        public void isEvenNumber(){
        boolean result = Even.isEven(4);
        assertTrue(result);
}

        @Test
        public void isOddNumber(){
        boolean result = Even.isEven(7);
        assertFalse(result);
}

    @Test
        public void isSecondEvenNumber(){
        boolean result = Even.isEven(0);
        assertTrue(result);
}

    @Test
        public void isThirdEvenNumber(){
        boolean result = Even.isEven(-2);
        assertTrue(result);
}

}
