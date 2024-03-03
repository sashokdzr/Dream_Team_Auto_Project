package Algorithms;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Recursion {
    public static Long factorial(int n) {
        while (n != 1) {
            return n * factorial(n - 1);
        }
        return (long) (n * 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

}
