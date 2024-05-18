package chapter17.intconsumer;

import java.util.function.IntConsumer;

public class IntConsumerSample {
    public static void main(String[] args) {

        IntConsumer intConsumer = (intValue) -> printIntValue(intValue);
        intConsumer.accept(20);
    }
    public static void printIntValue(int number){
        System.out.println(number * 5);
    }


}
