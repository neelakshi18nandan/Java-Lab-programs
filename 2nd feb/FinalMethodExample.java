class Neel {
    final void display() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Chiya extends Neel {
    // Cannot override display() because it is final

    /*
    void display() {
        System.out.println("This will cause a compile-time error");
    }
    */
}

public class FinalMethodExample {
    public static void main(String[] args) {
        Chiya c = new Chiya();
        c.display(); // calls parent class final method
    }
}
