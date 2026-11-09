package exception;

public class JsonSerializationException extends Exception {
    public JsonSerializationException(String format) {
        super(format);
    }
}
