package Codewars;

import java.util.Arrays;

public class Average {
    public static void main(String[] args) {
        System.out.println(newAvg(new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 9));
    }

    public static long newAvg(double[] arr, double navg) {
        double temp =Arrays.stream(arr).sum();
        long res = (long) Math.ceil(navg * (arr.length + 1) - temp);
        if (res <= 0) {
            throw new IllegalArgumentException("");
        }
        return res;
    }
}
