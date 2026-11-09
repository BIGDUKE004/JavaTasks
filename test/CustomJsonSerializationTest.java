import exception.JsonSerializationException;
import file.Encoder;
import file.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomJsonSerializationTest {
    @Test
    public void testCanSerializeToJson() throws JsonSerializationException {
        Product product = new Product();
        product.setPrice(1022);
        String json = Encoder.serialization(product);
        String expected = "{\"price\":1022}";
        assertEquals(json, expected);
    }

    @Test
    public void testCanDeserializeFromJson() throws JsonSerializationException {
        String json = "{\"price\":1022}";
        Product product = Encoder.deserializeFrom(json);
        assertEquals(product.getPrice(), 1022);
    }
}
