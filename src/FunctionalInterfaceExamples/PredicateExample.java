package FunctionalInterfaceExamples;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> lang = Arrays.asList("Java", "C", "Kotlin", "JavaScript", "C++", "C#", "GO", "Python", "PHP");

//        Predicate<String> moreThanFive = s -> s.length() > 5;

//        lang.stream()
//                .filter(moreThanFive)
//                .forEach(System.out::println);

        lang.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);
    }
}
