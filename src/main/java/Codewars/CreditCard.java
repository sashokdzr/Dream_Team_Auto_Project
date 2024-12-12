package Codewars;

public class CreditCard {
    public static void main(String[] args) {
        System.out.println("123".substring(0));
    }
    public static String maskify(String str) {
        int length = str.length();
        String printed = str.substring(length-5);
        String res = "#".repeat(length-5);
        return length <=4 ? str : "#".repeat(length-5) + str.substring(length-5);
        // throw new UnsupportedOperationException("Unimplemented");

    }
}
