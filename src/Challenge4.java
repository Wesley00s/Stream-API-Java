import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Challenge4 {
    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        numbs.removeIf(n -> n % 2 == 0);
        numbs.forEach(System.out::println);

    }
}
