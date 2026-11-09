package file;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import exception.JsonSerializationException;

public class Encoder {
    public static String serialization(Product product) throws JsonSerializationException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(product);
        } catch (JsonProcessingException exception){
            exception.printStackTrace();
            throw new JsonSerializationException(
                    String.format("failed to encode product to json \n reason: %s",
                            exception.getMessage())
            );
        }
    }

    public static Product deserializeFrom(String json) throws JsonSerializationException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Product product = mapper.readValue(json, Product.class);
            return product;
        } catch (JsonProcessingException exception){
            exception.printStackTrace();
            throw new JsonSerializationException("json not found");
        }
    }
}
