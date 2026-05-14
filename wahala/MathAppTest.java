//write a program that collect an operation e.g multiplication e.t.c, and call the proper method.....call the proper function means each operation is a function  then the parameter passed in is the value and operation, so:
//test for each operation 

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAppTest{

    @Test
        public void TestThatAssigningSymbolsForMultiplicationWorks(){

        int actual = MathApp.multiplicationOfNumbers(MathApp.numberone, MathApp.numbertwo);
        int expected = 20;
        assertEquals(actual, expected);
}


    @Test
        public void TestThatAssigningSymbolsForSubtractionWorks(){
        int actual = MathApp.subtractionOfNumbers(MathApp.numberone, MathApp.numbertwo);
        int expected = 1;
        assertEquals(actual, expected);
}

 @Test
        public void TestThatAssigningSymbolsForDivisionWorks(){
        int actual = MathApp.divisionOfNumbers(MathApp.numberone, MathApp.numbertwo);
        int expected = 1;
        assertEquals(actual, expected);
}

 @Test
        public void TestThatAssigningSymbolsForAdditionWorks(){
        int actual = MathApp.additionOfNumbers(MathApp.numberone, MathApp.numbertwo);
        int expected = 9;
        assertEquals(actual, expected);
}

}
