import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Challenge1 {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbs.sort(Comparator.naturalOrder());
        numbs.forEach(System.out::println);

//        numbs.stream()
//                .sorted(Comparator.comparing(n -> n))
//                .toList()
//                .forEach(System.out::println);
    }
}
