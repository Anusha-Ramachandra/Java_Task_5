import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseConverter {
    public static void main(String[] args) {
        // Given list of strings
        List<String> names = Arrays.asList("aBc", "d", "ef");

        // Convert list of strings to a stream, map each string to uppercase, and collect the results into a new list
        List<String> uppercaseNames = names.stream() // Create a stream from the list
                .map(String::toUpperCase) // Convert each string to uppercase
                .collect(Collectors.toList()); // Collect the results into a list

        // Print the results
        System.out.println("Uppercase names: " + uppercaseNames);
    }
}
