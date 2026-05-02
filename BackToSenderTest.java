import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class BackToSenderTest{

     @Test	
    public void testForAllowance(){
        assertEquals(45000, BackToSender.Allowance(80));
    }


}

