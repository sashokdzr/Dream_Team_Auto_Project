//I have four positive integers, A, B, C and D, where A < B < C < D.
// The input is a list of the integers A, B, C, D, AxB, BxC, CxD, DxA in some order.
// Your task is to return the value of D.

package Codewars;

import java.util.Arrays;

class DoubleValueEveryNextCall {
    public static void main(String[] args) {
        System.out.println(alphabet(new int[] {7, 96, 8, 240, 12, 140, 20, 56}));

    }
    public static int alphabet(int[] ns) {
        Arrays.sort(ns);
        return 1;
    }
}
