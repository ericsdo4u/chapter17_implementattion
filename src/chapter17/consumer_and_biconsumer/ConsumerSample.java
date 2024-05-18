package chapter17.consumer_and_biconsumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerSample {
    public static void main(String[] args) {
            Consumer<String> consumer = (s)->{
                System.out.println(s);
            };
            List<String> names = List.of("John", "Joe", "Johnny");
            names.forEach(consumer);

    }
}
