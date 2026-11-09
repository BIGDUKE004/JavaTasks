package lambdaAndStreams;

import java.util.function.Predicate;

public class PredicateImpl {
    static void main() {
        Predicate<Integer> predicate = (num) -> num % 2 == 0;
        System.out.println(predicate.test(1));
    }
}
