package Codewars;

public class PrinterErrors {
    public static String printerError(String s) {
        long first1 = s.chars().filter(i->i>97).filter(i->i<109).count();

        int second = s.length();
//        int first  = s.replaceAll("[a-m]", "").length();
        return String.format("%d/%d",second-first1, second);
    }
}
