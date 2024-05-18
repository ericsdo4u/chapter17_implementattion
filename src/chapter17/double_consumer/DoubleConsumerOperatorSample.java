package chapter17.double_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleConsumer;

public class DoubleConsumerOperatorSample {
    public static void main(String[] args) {

        DoubleConsumer doubleConsumer = (doubleValue) ->
                printDoubleValue(doubleValue);
        doubleConsumer.accept(3);
    }
    public static void printDoubleValue(Double numbers){
        System.out.println(numbers * 2);

    }
}


