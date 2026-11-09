package lambdaAndStreams;

import java.util.function.BiFunction;

public class BiFunctionImpl {
    static void main() {

        BiFunction<String, String, String> biFunction = (name, surname) -> name + " " + surname;
        System.out.println(biFunction.apply("Elijah", "Miracle"));
    }
}
