import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LargestTest{

    @Test
    public void Largest(){
int actual = Largest.max(1,2,3);
int expected = 3;
assertEquals(actual, expected);
}

    @Test
    public void LargestNum(){
int actual = Largest.max(3, 2, 1);
int expected = 3;
assertEquals(actual, expected);
}

    @Test
    public void LargestDigit(){
int actual = Largest.max(2,2,2);
int expected = 2;
assertEquals(actual, expected);
}

    @Test
    public void Large(){
int actual = Largest.max(-1,-2,-3);
int expected = -1;
assertEquals(actual, expected);

}

}
