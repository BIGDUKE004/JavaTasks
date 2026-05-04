import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumTest{

    @Test
        public void sumDigit(){
int actual = Sum.SumOfDigits(123);
int expected = 6;
assertEquals(actual, expected);
}

 @Test
        public void sumOfTheDigit(){
int actual = Sum.SumOfDigits(0);
int expected = 0;
assertEquals(actual, expected);
}

 @Test
        public void sumOfDigit(){
int actual = Sum.SumOfDigits(999);
int expected = 27;
assertEquals(actual, expected);
}

 @Test
        public void sumOfADigit(){
int actual = Sum.SumOfDigits(1000);
int expected = 1;
assertEquals(actual, expected);
}

}
