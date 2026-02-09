class Test {
    public static void main(String[] args) {

        Test obj = new Test();
        obj = null; // Now eligible for garbage collection

        System.gc(); // Request GC (not guaranteed)
    }
}
