import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MinMaxTest{


@Test
    public void testThatIHaveAListOfNumbersIGetTheRange(){
        int [] numbers = {2, 5, 7, 9, 20};
        int expectedRange = 18;
        int actualRange = MinMax.getRangeOf(numbers);
        assertEquals(actualRange, expectedRange);
    } 


@Test
    public void testThatIGetTheRangeOfTheListOfNumbersIHave(){
        int [] digit = {2, 3, 1, 4, 6};
        int expectedRange = 5;
        int actualRange = MinMax.getRangeOf(digit);
        assertEquals(actualRange, expectedRange);
    } 







}
