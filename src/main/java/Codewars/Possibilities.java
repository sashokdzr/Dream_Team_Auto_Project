package Codewars;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Possibilities {
    public static void main(String[] args) {
        isAllPossibilities(new int[]{0,1,2,4,3,-1, -10});
    }
    public static boolean isAllPossibilities(int[] arg) {
        IntSummaryStatistics iss = Arrays.stream(arg).summaryStatistics();
        System.out.println(iss.toString());
        return iss.getMin() == 0 && iss.getMax() == arg.length - 1;
    }
}
