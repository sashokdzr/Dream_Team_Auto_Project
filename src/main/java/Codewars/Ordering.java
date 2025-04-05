package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ordering {
    public static void main(String[] args) {
        System.out.println(orderWord("jhu hrcr (@^BKKJGY"));
    }
    public static String orderWord(String s){



        if (s.length()<1 || s == null){
            return "Invalid String!";
        }

        return Stream.of(s).mapToInt(i -> Integer.parseInt(i)).sorted().toString();
//                Stream.of(s).map(i -> Integer.parseInt(i)).sorted().collect(Collectors.toList()).toString();

//        int[] charNum = new int[s.length()];
//        String result = "";
//        for (int i=0; i<s.length(); i++){
//            charNum[i] = (int) s.charAt(i);
//        }
//
//        Arrays.sort(charNum);
//
//        for (int k : charNum){
//            result+= Character.toString(k);
//        }
//
//        return result;
    }
}
