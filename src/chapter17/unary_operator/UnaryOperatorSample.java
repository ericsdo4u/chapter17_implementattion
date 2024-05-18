package chapter17.unary_operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorSample {
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = (melody) -> melody +" whooped michael";
        System.out.println(unaryOperator.apply("Melody"));
    }
}
