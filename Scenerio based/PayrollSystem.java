import java.util.ArrayList;
import java.util.List;


class Employee {
    private String employeeId;
    private String name;
    private String role;
    private double baseSalary;

    public Employee(String id, String name, String role, double salary) {
        this.employeeId = id;
        this.name = name;
        this.role = role;
        this.baseSalary = salary;
    }

    public double calculateSalary() {
        switch (role.toLowerCase()) {
            case "manager": return baseSalary + (baseSalary * 0.20);
            case "developer": return baseSalary + (baseSalary * 0.10);
            case "designer": return baseSalary + (baseSalary * 0.05);
            case "intern": return 1000.0;
            default: return baseSalary;
        }
    }

    public void displayEmployeeDetails() {
        System.out.printf("ID: %s | Name: %s | Role: %s | Net Salary: $%.2f\n", 
                          employeeId, name, role, calculateSalary());
    }

    public String getEmployeeId() { return employeeId; }
}


class Payroll {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) { employees.add(e); }

    public void calculateAllSalaries() {
        System.out.println("\n--- Payroll Report ---");
        for (Employee e : employees) e.displayEmployeeDetails();
    }
}


public class PayrollSystem {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        
        payroll.addEmployee(new Employee("E01", "John", "Manager", 5000));
        payroll.addEmployee(new Employee("E02", "Jane", "Developer", 4000));
        payroll.addEmployee(new Employee("E03", "Mark", "Intern", 0));

        payroll.calculateAllSalaries();
    }
}