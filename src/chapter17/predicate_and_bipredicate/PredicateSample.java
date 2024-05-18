package chapter17.predicate_and_bipredicate;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<Boolean> predicate = (word) -> word.equals("");
        System.out.println(predicate.test(true));

    }
}
