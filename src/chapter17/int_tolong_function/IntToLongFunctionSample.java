package chapter17.int_tolong_function;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionSample {
    public static void main(String[] args) {
        IntToLongFunction intToLongFunction = (intNumber) -> Integer.valueOf(intNumber).longValue();
        long number = intToLongFunction.applyAsLong(20);
        System.out.println(number * 2);
    }
}
