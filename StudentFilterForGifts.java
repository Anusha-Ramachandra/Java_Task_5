import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilterForGifts {
    public static void main(String[] args) {
        //  Create a list of student names
        List<String> students = Arrays.asList(
                "Anu", "Navi", "Ani", "Nithya", "Amrutha",
                "Nikitha", "Annapoorna", "Bhuvaneshwari", "Dharma", "Anvitha"
        );
        List<String> studentsStartingWithA = students.stream() // Create a stream from the list
                .filter(name -> name.startsWith("A")) // Filter names starting with "A"
                .collect(Collectors.toList()); // Collect the results into a new list

        // Step 3: Print the filtered list
        System.out.println("Students whose names start with 'A': " + studentsStartingWithA);
    }
}

