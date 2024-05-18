package chapter17.predicate;

import java.util.function.BiPredicate;

public class BiPredicateSample {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (wife, number) -> wife.length() == number;

        System.out.println(biPredicate.test("Donald", 8));
    }
}
