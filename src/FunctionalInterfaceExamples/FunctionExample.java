package FunctionalInterfaceExamples;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        Function<Integer, Integer> square = num -> num * num;
//        Function<Integer, String> toString = Object::toString;
//        Function<Integer, Double> toDouble = Double::valueOf;
//
//        List<Integer> squareNumbs = numbs.stream()
//                .map(square)
//                .toList();
//
//        List<String> numbsToString = numbs.stream()
//                .map(toString)
//                .toList();
//
//        List<Double> numbsToDouble = numbs.stream()
//                .map(toDouble)
//                .toList();

        List<Integer> squareNumbs = numbs.stream()
                .map(num -> num * num)
                .toList();

        List<String> numbsToString = numbs.stream()
                .map(String::valueOf)
                .toList();

        List<Double> numbsToDouble = numbs.stream()
                .map(Double::valueOf)
                .toList();

        squareNumbs.forEach(System.out::println);
        numbsToString.forEach(System.out::println);
        numbsToDouble.forEach(System.out::println);

    }
}
