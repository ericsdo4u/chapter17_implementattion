package chapter17.function;

import java.util.function.Function;

public class FunctionSample {
        public static void main(String[] args) {
            Function<String, Integer> function = (name) -> name.length();

            System.out.println(function.apply("Donald"));

        }
}
