import java.util.Arrays;
import java.util.List;

public class Challenge7 {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numbs.stream()
                .filter(n -> n > 10)
                .toList().forEach(System.out::println);

    }
}
