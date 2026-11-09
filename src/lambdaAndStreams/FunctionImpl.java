package lambdaAndStreams;

import java.util.function.Function;

public class FunctionImpl {
    static void main() {
        Function<Integer, String> function = (num) -> String.valueOf(num);
        System.out.println(function.apply(18));
    }
}
