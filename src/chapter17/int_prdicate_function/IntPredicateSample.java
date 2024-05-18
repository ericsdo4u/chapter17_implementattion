package chapter17.int_prdicate_function;

import java.util.function.IntPredicate;

public class IntPredicateSample {
    public static void main(String[] args) {
        //or (value)-> testPredicate(value);
        IntPredicate intPredicate = IntPredicateSample::testPredicate;
        System.out.println(intPredicate.test(5));
    }
    private static boolean testPredicate(int value) {
        return value == 4;
    }
}
