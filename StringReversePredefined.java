class StringReversePredefined {
    public static void main(String[] args) {
        String str = "Java";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
    }
}
