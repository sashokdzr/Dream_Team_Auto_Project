//package Codewars;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class SquareEveryDigit {
////    public static void main(String[] args) {
////        System.out.println(squareDigits(123));
////    }
////
////    public int squareDigits1(int n) {
////        return Integer.parseInt(String.valueOf(n)
////                .chars()
////                .map(i -> Integer.parseInt(String.valueOf((char) i)))
////                .map(i -> i * i)
////                .mapToObj(String::valueOf)
////                .collect(Collectors.joining("")));
////    }
////    public static int squareDigits(int n) {
////        String temp = String.valueOf(n);
////        Arrays.stream(temp.split(""))
////                .map(k -> Integer.parseInt(k))
////                .map(i -> i * i)
////
////
////         String result = "";
////
////        for (Integer k : res){
////            result += String.valueOf(k);
////        }
////        return Integer.parseInt(result);
////    }
//}
