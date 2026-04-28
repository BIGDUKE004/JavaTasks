import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTest{

     @Test	
    public void testForAmountOfPizzaToBuy(){
        assertEquals(13, Pizza.pizzaSapaSize(50));
    }

    @Test
    public void testForLeftOverPizza(){
        assertEquals(3, Pizza.pizzaSmallBoys(50));
}

        @Test
    public void testForPriceToPayBasedOnTheAmountOfPizzaToBuy(){
assertEquals(28000, Pizza.pizzaBigBoys(50));
}

@Test
    public void testForPriceToLeftOver(){
assertEquals(20800, Pizza.pizzaOdogwu(50));
}

}

