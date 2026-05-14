import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
        public void TestThatDiscountOneWorks(){
        int actual = OshoFreePromoEngine.discountEngine(18000, "");
        int expected = 18000;
        assertEqual(actual, expected);

}








}
