import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest{

    @Test
        public void TestThatDiscountOneWorks(){
        int actual = OshoFreePromoEngine.promoOne(3000, "BRR");
        int expected = 3000;
        assertEquals( expected, actual);

}

    @Test
        public void TestThatDiscountTwoWorks(){
        double actual = OshoFreePromoEngine.promoTwo( 13000, "STARTER10");
        double expected = 11700;
        assertEquals(actual, expected);

}

    @Test
        public void TestThatDiscountTwoWorksForInvalidAmount(){
        double actual = OshoFreePromoEngine.promoTwo( -6000, "STARTER10");
        double expected = 0.0;
        assertEquals(actual, expected);

}

    @Test
        public void TestThatDiscountForBigBoyWorks(){
        double actual = OshoFreePromoEngine.promoThree(16000, "BIGBOY20");
        double expected = 12800;
        assertEquals(expected, actual);
}

    @Test
        public void TestThatDiscountForBigBoyWorksInvalidInputWorks(){
        double actual = OshoFreePromoEngine.promoThree(-20000, "BIGBOY20");
        double expected = 0.0;
        assertEquals(expected, actual);
}

    @Test
        public void TestThatDiscountForOshoFreeWorks(){
        double actual = OshoFreePromoEngine.promoFour(30000, "OSHOFREE35");
        double expected = 19500;
        assertEquals(expected, actual);

}

    @Test
        public void TestThatDiscountForOshoFreeInvalidInputWorks(){
        double actual = OshoFreePromoEngine.promoFour(-30000, "OSHOFREE35");
        double expected = 0.0;
        assertEquals(expected, actual);


}
}
