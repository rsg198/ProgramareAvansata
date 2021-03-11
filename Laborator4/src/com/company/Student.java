import com.company.
import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparator<Student> {
    private String name;
    double grade;
    private School[] Preferences;

    public Student() {
    }

    public Student(String name, int grade, School[] Preferences) {
        this.name = name;
        this.Preferences = Preferences;
        this.grade=grade;
    }

    public Student(String name) {

        this.name=name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getGrade() {

        return grade;
    }

    public void setGrade(double grade) {

        this.grade = grade;
    }

    public School[] getSchoolPreferences() {

        return Preferences;
    }

    public void setSchoolPreferences(School[] Preferences) {

        this.Preferences = Preferences;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ",Preferences=" + Arrays.toString(Preferences) +
                '}';
    }
}