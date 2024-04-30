package FunctionalInterfaceExamples;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

//        Consumer<Integer> printPairs = numb -> {
//            if (numb % 2 == 0) {
//                System.out.println(numb);
//            }
//        };

//        numbs.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer n) {
//                if(n % 2 == 0) {
//                    System.out.println(n);
//                }
//            }
//        });

//        numbs.forEach(n -> {
//                    if (n % 2 == 0) {
//                        System.out.println(n);
//                    }
//                }
//        );

        numbs.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
