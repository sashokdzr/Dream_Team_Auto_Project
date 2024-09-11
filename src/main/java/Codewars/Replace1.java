package Codewars;

public class Replace1 {
    public static void main(String[] args) {
        System.out.println(stringClean("Hello мир!"));
    }
        static String stringClean(final String text) {
            return text.replaceAll("[a-я,A-Я]","");
        }

}
