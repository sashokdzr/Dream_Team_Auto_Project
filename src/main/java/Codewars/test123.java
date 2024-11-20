package Codewars;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test123 {
        public static void main(String[] args) {
            System.out.println("ab".equals("ab"));
            Integer.toBinaryString(1+2);


        }
        public static String bingo(int[] numberArray) {
            String newStr="";
            for (int n:numberArray){
                newStr+=n+",";
            }
            return newStr.contains("2,") && newStr.contains("9,") && newStr.contains("14,") && newStr.contains("7,") && newStr.contains("15,")? "WIN" :"LOSE";
        }

    public static String replaceDots(String str) {
        return str.replaceAll(".", "-");
    }

}
