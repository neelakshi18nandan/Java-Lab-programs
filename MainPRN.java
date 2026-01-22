import java.util.Scanner;

class StudentPRN {
    String name;
    int prn;

    StudentPRN(String n, int p) {
        name = n;
        prn = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("PRN: " + prn);
    }
}

public class MainPRN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter PRN: ");
        int prn = sc.nextInt();

        StudentPRN s = new StudentPRN(name, prn);
        s.display();
    }
}
