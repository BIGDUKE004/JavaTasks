import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayFunctionTest{

    @Test
    public void testThatIHaveAListOfNumbersIGetTheLargest(){
        int [] numbers = {50, 20, 12, 8, 36, 200, 67};
        int expectedHighest = 200;
        int actualHighest = ArrayFunction.getLargestOf(numbers);
        assertEquals(actualHighest, expectedHighest);
    } 

    @Test
    public void testThatReverseArrayGivesArrayFromTheLastElement(){
        int [] numbers = {50, 20, 12, 8, 36, 200, 67};
        int [] expectedReversedArray = {67,200, 36, 8, 12, 20, 50};
        int [] actualReversedArray = ArrayFunction.reverseArray(numbers);
        assertArrayEquals(actualReversedArray, expectedReversedArray);
    }


    @Test
    public void testThatGivenItemIsFoundInArrayOrNot(){
        int [] numbers = {50, 20, 12, 8, 36, 200, 67};
        int numberToFind = 8;
        boolean isPresent = ArrayFunction.isPresent(numbers, numberToFind);
        assertTrue(isPresent);
    }  

    @Test
    public void testThatGivenNumberGivesArrayOfDigits(){

        String number = "2801";
        String [] expectedExtractedDigits = {"2","8","0","1"};
        String [] actualExtractedDigits = ArrayFunction.extractDigitsOf(number);
        assertArrayEquals(actualExtractedDigits, expectedExtractedDigits);
    } 

      



}
