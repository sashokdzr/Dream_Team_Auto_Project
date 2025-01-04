package Codewars;

import java.util.HashSet;
import java.util.Set;

public class Isograms {
    public static boolean  isIsogram(String str) {

        String str1 = str.toLowerCase();
        char[] charArray = str1.toCharArray();
        Set<Character> newStr = new HashSet<>();
        for(char ch:charArray){
            newStr.add(ch);
        }
        return str1.length() == newStr.size();
    }
}
