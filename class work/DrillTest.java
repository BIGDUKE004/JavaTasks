import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DrillTest{

    @Test
    public void testThatIgetTheNumberThatGivesTheHighestValue(){
    
    Drill drill= new Drill();

    int [] value = {13, 7, 1, 8, 2};

     int [] actual = drill.getLargestSumOfTwoNumbersInAnArray(value);

//    int [] expected = {13, 7};

    assertEquals(drill.finalValue, actual);
       
    }

}
