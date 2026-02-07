class StudentStatic {
    int roll;
    String name;
    static String college = "Symbiosis Institute of Technology";

    StudentStatic(int r, String n) {
        roll = r;
        name = n;
    }

    void display() {
        System.out.println("Roll No: " + roll);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
}

public class MainStatic {
    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic(1, "Neelakshi");
        StudentStatic s2 = new StudentStatic(2, "Namish");

        s1.display();
        System.out.println();
        s2.display();
    }
}
