package chapter17.int_unary_operator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorSample {
    public static void main(String[] args) {
        IntUnaryOperator intUnaryOperator = (value) -> value * 5;
        System.out.println(intUnaryOperator.applyAsInt(5));

    }
}
