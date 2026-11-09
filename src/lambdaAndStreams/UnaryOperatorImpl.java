package lambdaAndStreams;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (num) -> Integer.valueOf(num);
        System.out.println(unaryOperator.apply(1));
    }
}
