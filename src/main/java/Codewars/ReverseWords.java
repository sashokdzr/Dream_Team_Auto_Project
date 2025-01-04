package Codewars;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("     "));
    }

    public static String reverseWords(final String original) {
        String result = "";
        if (original.replace(" ", "").length() == 0){
            return original;
        }

        var tempString = original.split(" ");
        for (int i = 0; i < tempString.length; i++) {
            String world = tempString[i];
            for (int j=world.length()-1; j>=0; j--){
                result += world.charAt(j) + "";
            }
            result+=" ";
        }
        return result.substring(0, result.length()-1);
    }

    public static void printRsult(String s){
        System.out.println(reverseWords(s));
    }
}
