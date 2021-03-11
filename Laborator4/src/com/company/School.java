import com.company.
import java.util.Arrays;

public class School <Student> implements Comparable<School> {
    public String name;
    private Student[] Preferences;
    private int capacity;

    public School() {
    }

    public School(String name, Student[] Preferences, int capacity) {
        this.name = name;
        this.Preferences = Preferences;
        this.capacity = capacity;
    }

    public School(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getPreferences() {
        return Preferences;
    }

    public void setPreferences(Student[] Preferences) {
        this.Preferences = Preferences;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", Preferences=" + Arrays.toString(Preferences) +
                ", capacity=" + capacity +
                '}';
    }
}

    @Override
    public int compareTo(School o) {
        return 0;
    }