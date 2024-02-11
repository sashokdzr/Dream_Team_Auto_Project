package Codewars;

import java.util.stream.Stream;

public class SplitInParts {
    public static void main(String[] args) {
        System.out.println(splitInParts("supercalifragilisticexpialidocious", 3));
    }
    public static String splitInParts(String s, int l) {
        // your code
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            if ((i+1) % l == 0){
                sb.append(s.charAt(i));
                sb.append(' ');
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
