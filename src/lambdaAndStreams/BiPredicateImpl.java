package lambdaAndStreams;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    static void main(String[] args) {
        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1 > num2;
        System.out.println(biPredicate.test(1, 2));
    }
}
