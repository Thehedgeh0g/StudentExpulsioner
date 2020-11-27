package student;

import java.util.List;

public class Student {
    private final String faculty;
    private final String name;
    private final List<String> debts;


    public Student(String name, String faculty, List<String> debts) {
        this.name = name;
        this.faculty = faculty;
        this.debts = debts;
    }

    public String getName() {
        return name;
    }

    public final String getFaculty() {
        return faculty;
    }

    public List<String> getDebts() {
        return debts;
    }

}
