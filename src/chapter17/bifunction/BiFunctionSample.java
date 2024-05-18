package chapter17.bifunction;

import java.util.function.BiFunction;

public class BiFunctionSample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (name, number)-> name.length() == number;

        Boolean result =  biFunction.apply("Donald", 8);
        Boolean result1 = biFunction.apply("Eric", 4);
        System.out.println(result);
        System.out.println(result1);
    }
}
