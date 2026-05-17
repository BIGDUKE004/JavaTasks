import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testForReverse {

    @Test
    public void testThatReverseArrayGivesArrayFromTheLastElement() {

        int[] numbers = {50, 20, 12, 8, 36, 200, 67};

        int[] expectedReversedArray = {67, 200, 36, 8, 12, 20, 50};

        int[] actualReversedArray = Reverse.list(numbers);

        assertArrayEquals(expectedReversedArray, actualReversedArray);
    }
}
