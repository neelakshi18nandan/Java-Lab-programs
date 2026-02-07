class student{
    String name;

    student(String name){
        this.name =  name;
    }
    void display() {
        System.out.println("Name: "+ this.name);
    }
}
public class ThisKeywordExample {
    public static void main(String[] args) {
        student s = new student("Alice");
        s.display();
    }
}
