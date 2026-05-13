import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class StandardDeviationTest{

    @Test
        public void TestForSumOfNumbers(){
        double [] number = {3, 5, 12, 54, 78, 97, 34, 54, 90, 53};
        double actual = 480;
        double expected = StandardDeviation.summation(number);
        assertEquals(expected, actual);
}

    @Test
        public void TestForCountOfNumbers(){
        double [] number = {3, 5, 12, 54, 78, 97, 34, 54, 90, 53};
        double actual = 48;
        double expected = StandardDeviation.mean(number);
        assertEquals(expected, actual);
}

    @Test
        public void TestForMeanDeviation(){
        double [] number = {3, 5, 12, 54, 78, 97, 34, 54, 90, 53};
        double actual  = 10528;
        double expected = StandardDeviation.subtractMeanFromValue(number);
        assertEquals(expected, actual);
}

@Test
        public void TestForVariance(){
        double [] number = {3, 5, 12, 54, 78, 97, 34, 54, 90, 53};
        double actual  = 34.20201423568176;
        double expected = StandardDeviation.variance(number);
        assertEquals(expected, actual);
}


} 
