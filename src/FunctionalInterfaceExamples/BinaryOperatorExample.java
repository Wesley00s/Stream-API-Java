package FunctionalInterfaceExamples;

import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        BinaryOperator<Integer> sum = Integer::sum;

//        int result = numbs.stream()
//                .reduce(0, sum);

        int result = numbs.stream()
                .reduce(0, Integer::sum);

        System.out.println(result);
    }
}
