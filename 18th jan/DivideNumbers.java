class DivideNumbers {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Enter two numbers ");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (b == 0) {
            System.out.println("A number can't be divided by 0");
        } else {
            System.out.println("Result: " + (a / b));
        }
    }
}
