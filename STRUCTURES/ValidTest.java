import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidTest{

    @Test
        public void validTriangle(){
boolean value = Valid.isValid(3.0 , 4.0 , 5.0 );
assertTrue(value);
}

    @Test
        public void areaOfTriangle(){
double actual = Valid.area(3.0 , 4.0 , 5.0);
double expected = 6.0;
assertEquals(actual, expected);
}

}
