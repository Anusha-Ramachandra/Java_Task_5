import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStringFilter {
    public static void main(String[] args) {
        // Creating a list of strings with some empty and some non-empty values
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        List<String> nonEmptyStrings = strings.stream() // Creating a stream from the list
                .filter(s -> !s.isEmpty()) // Filter out empty strings
                .collect(Collectors.toList()); // Collect the results into a new list

        // Printing the list of non-empty strings
        System.out.println("Non-empty strings: " + nonEmptyStrings);
    }
}

