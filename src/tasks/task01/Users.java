package tasks.task01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Users {

    public static void main(String[] args) {
        getOutput(getData(), consumerData());
    }

    private static List<String> getData() {
        return Arrays.asList("Tom", "Alice", "Bob", "Lucy");
    }

    private static Consumer<List<String>> consumerData() {
        return updatedList -> updatedList.forEach(str -> System.out.println("Name is " + str));
    }

    private static void getOutput(List<String> list, Consumer<List<String>> consumer) {
        consumer.accept(list);
    }
}
