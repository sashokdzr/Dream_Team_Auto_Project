package Algorithms;

import java.time.LocalTime;
import Codewars.*;
public class Main {

    public static void main(String[] args) {
        long before = LocalTime.now().toNanoOfDay();
        //Recursion
        System.out.printf("Factorial n = %d", Recursion.factorial(11));
        //NOD
        int res = Recursion.gcd(75, 250);
        System.out.printf("%nNOD a and b = %d", res);

        long after = LocalTime.now().toNanoOfDay();
        System.out.printf("%nTime in nanoseconds: %d", after - before);
        System.out.printf("%n/////");
        System.out.println(Math.round(92.4789));

        System.out.println(ReverseWords.reverseWords("Hello world!"));
        ReverseWords.printRsult("Hoe are you?");
    }
}