package chapter17.long_toint_function;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionSample {
    public static void main(String[] args) {
        LongToIntFunction longToIntFunction = (longNumber) -> Long.valueOf(longNumber).intValue();
        int number = longToIntFunction.applyAsInt(50L);
        System.out.println(number);
    }
}
