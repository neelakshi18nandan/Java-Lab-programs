class Student {
    void showStudent() {
        System.out.println("This is Student class");
    }
}

class Teacher {
    void showTeacher() {
        System.out.println("This is Teacher class");
    }
}

class College {
    void showCollege() {
        System.out.println("This is College class");
    }

    public static void main(String[] args) {

        // Creating objects of all classes
        Student s = new Student();
        Teacher t = new Teacher();
        College c = new College();

        // Calling methods
        s.showStudent();
        t.showTeacher();
        c.showCollege();
    }
}
