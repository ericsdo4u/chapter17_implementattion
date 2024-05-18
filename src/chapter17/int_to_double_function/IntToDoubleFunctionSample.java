package chapter17.int_to_double_function;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionSample {
    public static void main(String[] args) {
        IntToDoubleFunction intToDoubleFunction = (intValue) -> Integer.valueOf(intValue).doubleValue();
        System.out.println(intToDoubleFunction.applyAsDouble(12));
    }
}
