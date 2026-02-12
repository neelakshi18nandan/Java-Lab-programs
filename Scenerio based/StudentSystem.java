import java.util.ArrayList;
import java.util.List;


class Student {
    private String name; 
    private List<Double> grades; 

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) { 
        grades.add(grade);
    }

    public double calculateAverage() { 
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void displayStudentDetails() { 
        System.out.println("Name: " + name);
        System.out.println("Grades: " + grades);
        System.out.printf("Average: %.2f\n", calculateAverage());
    }

    public String getName() { return name; }
}

class GradeManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) { 
        students.add(student);
    }

    public Student findStudentByName(String name) { 
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) return s;
        }
        return null;
    }

    public void displayAllStudents() { 
        for (Student s : students) {
            s.displayStudentDetails();
            System.out.println("--------------------");
        }
    }
}

public class StudentSystem {
    public static void main(String[] args) {
        GradeManager manager = new GradeManager();
        
        Student s1 = new Student("Alice");
        s1.addGrade(85.0);
        s1.addGrade(92.5);
        manager.addStudent(s1);

        manager.displayAllStudents();
    }
}