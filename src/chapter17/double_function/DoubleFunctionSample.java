package chapter17.double_function;

import java.util.function.DoubleFunction;

public class DoubleFunctionSample {
    public static void main(String[] args) {
        DoubleFunction doubleFunction = (doubleValue) -> printValue(doubleValue);
        doubleFunction.apply(5);

    }
    public static double printValue(double number){
        System.out.println(number + 5);
        return number;
    }

}
