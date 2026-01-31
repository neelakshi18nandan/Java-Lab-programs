class Vehicle {
    String category = "Vehicle";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    String category = "Car";

    void displayInfo() {
        System.out.println("Child category: " + category);
        System.out.println("Parent category: " + super.category);

        super.start(); // calling parent method
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Car c = new Car();
        c.displayInfo();
    }
}
