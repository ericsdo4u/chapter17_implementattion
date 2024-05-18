package chapter17.unary_operator;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorSample {
    public static void main(String[] args) {
        LongUnaryOperator longUnaryOperator =(number) -> 2 * number;
        Long result = longUnaryOperator.applyAsLong(30L);
        System.out.println(result);
    }
}
