import com.company.
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    private static List<String> studentsName = new ArrayList<>(Arrays.asList("S0", "S1", "S2", "S3"));
    private static List<String> schoolsName = new ArrayList<>(Arrays.asList("H0", "H1", "H2"));
    private static List<Double> studentsGrades = new ArrayList<>(Arrays.asList(6.5, 10, 9.1, 7.6));



    private static Set<School> school = (TreeSet<School>) schoolsName.stream()
            .map(School::new)
            .collect(Collectors.toSet());

    private static List<Student> student = (LinkedList<Student>) studentsName.stream()
            .map(Student::new)
            .collect(Collectors.toList());


    public static void main(String[] args) {
    }

}