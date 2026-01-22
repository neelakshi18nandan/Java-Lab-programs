class Employee {

    // Instance Method
    void showName(String name) {
        System.out.println("Employee Name: " + name);
    }

    // Static Method
    static void showCompany() {
        System.out.println("Company: TCS");
    }
}

public class MethodDemo {
    public static void main(String[] args) {

        Employee.showCompany();   // Static method call

        Employee e = new Employee();
        e.showName("Neelakshi");   // Instance method call
    }
}
