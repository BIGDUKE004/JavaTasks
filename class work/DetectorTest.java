import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DetectorTest{

    @Test
    public void testForDetectingInsignificantCharacters(){
        
    Detector detector = new Detector();

    String userinput = "Miracle";
    
    detector.countInsensitiveCharacters(userinput);

    int expected = 1;

    assertEquals(detector.result, expected);

}


}
