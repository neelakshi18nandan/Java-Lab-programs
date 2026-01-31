class BaseClass {
    int value = 10;

    BaseClass() {
        System.out.println("BaseClass constructor");
    }
}

class DerivedClass extends BaseClass {
    int value = 20;

    DerivedClass() {
        super(); // calls BaseClass constructor
        System.out.println("DerivedClass constructor");
    }

    void showValues(int value) {
        System.out.println("Local value: " + value);
        System.out.println("Current class value: " + this.value);
        System.out.println("Parent class value: " + super.value);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        DerivedClass obj = new DerivedClass();
        obj.showValues(30);
    }
}
