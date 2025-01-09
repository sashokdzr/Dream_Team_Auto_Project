package Codewars;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Sequence {
    public static void main(String[] args) {
        System.out.println(arithmeticSequenceElements(1,1,10));
        System.out.println(arithmeticSequenceElements1(1,2,5));
    }
    public static String arithmeticSequenceElements(int a, int d, long n) {
        String result = a + ", ";
        for (int i=0; i<n-1; i++){
            result += a + d + ", ";
            a += d;
        }
        // Solution goes here
        return result.substring(0, result.length()-2);
    }

    public static String arithmeticSequenceElements1(int a, int d, long n) {
        return LongStream.range(0, n).mapToObj(Long::toString)
                .collect(Collectors.joining(", "));

    }


}
