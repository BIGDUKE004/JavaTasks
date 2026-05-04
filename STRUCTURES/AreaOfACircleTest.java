import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaOfACircleTest{

    @Test
        public void area(){
double actual = AreaOfACircle.circleArea(1.0);
double expected = 3.14159;
double tolerance = 0.001;
assertEquals(actual, expected, tolerance);
}

    @Test
        public void areaOne(){
double actual = AreaOfACircle.circleArea(5.0);
double expected = 78.5398;
double tolerance = 0.001;
assertEquals(actual, expected, tolerance);
}

    @Test
        public void areaTwo(){
double actual = AreaOfACircle.circleArea(0.0);
double expected = 0.0;
double tolerance = 0.001;
assertEquals(actual, expected, tolerance);
}
}
