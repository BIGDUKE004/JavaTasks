package lambdaAndStreams;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 + num2;
        System.out.println(binaryOperator.apply(1, 2));
    }
}
