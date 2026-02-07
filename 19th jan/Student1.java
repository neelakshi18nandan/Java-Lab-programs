class Student1 {
    int id;
    String name;

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.id = 101;
        s1.name = "Alice";

        Student1 s2 = new Student1();
        s2.id = 102;
        s2.name = "Bob";

        Student1 s3 = new Student1();
        s3.id = 103;
        s3.name = "Charlie";

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
        System.out.println(s3.id + " " + s3.name);
    }
}
