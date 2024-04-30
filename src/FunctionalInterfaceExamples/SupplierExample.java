package FunctionalInterfaceExamples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> welcome = () -> "Hello World";

        List<String> welcomeMessages = Stream.generate(welcome)
                .limit(5)
                .toList();

        welcomeMessages.forEach(System.out::println);
    }
}
