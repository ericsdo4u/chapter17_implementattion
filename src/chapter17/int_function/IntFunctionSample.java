package chapter17.int_function;

import java.util.function.IntFunction;

public class IntFunctionSample {
    public static void main(String[] args) {

        IntFunction intFunction = (value) -> printIntFunction(value);
        intFunction.apply(100);
    }
    public static int printIntFunction(int number){
        System.out.println(number * 2);
        return number;
    }

}
