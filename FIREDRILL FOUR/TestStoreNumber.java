import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestStoreNumber {

    @Test
    public void testCollectTenIntegers() {

        int[] numbers = new int[10];

        for (int digit = 0; digit < 10; digit++) {
            numbers[digit] = digit + 1;
        }

        assertEquals(10, numbers.length);

        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10}, numbers);
    }
}
