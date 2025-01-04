package Codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Take 2 strings s1 and s2 including only letters from a to z.
//Return a new sorted string (alphabetical ascending),
//the longest possible, containing distinct letters -
//each taken only once - coming from s1 or s2.
public class TwoToOne {
    public static String longest (String s1, String s2) {
         char[] ch1 = s1.toCharArray();
         char[] ch2 = s2.toCharArray();

         Set<Character> result = new HashSet<>();
         for (char k : ch1){
             result.add(k);
        }
        for (char o : ch2){
            result.add(o);
        }
        Object[] arr3 = result.toArray();
        Arrays.sort(arr3);

        StringBuilder sb = new StringBuilder();
        for (Object k:arr3){
            sb.append(k);
        }


        return sb.toString();

        // your code
    }
}
