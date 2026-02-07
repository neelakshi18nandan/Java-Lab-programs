class ParameterizedMethodPre {

    void display(int a, int b) {
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
    }

    public static void main(String[] args) {

        ParameterizedMethodPre obj = new ParameterizedMethodPre();
        obj.display(50, 20); // predefined values
    }
}
