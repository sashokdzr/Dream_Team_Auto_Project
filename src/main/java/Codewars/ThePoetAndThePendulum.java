package Codewars;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.util.Arrays.sort;

//doTest(new int[]{10,5,6,10}, new int[]{10,5,6,10}); 5 6 7 8 9
class Poet {
    public static void main(String[] args) {
        int[] test = {10,5,6,10,11};
        int[] testArr = pendulum(test);
        System.out.println(Arrays.toString(testArr));
    }
    static int[] pendulum(int[] values) {
        sort(values);
        int[] result = new int[values.length];
        for (int i = 0, l = (values.length - 1) / 2, r = l; i < result.length; i++) {
            result[i % 2 == 0 ? l-- : ++r] = values[i];
        }
        return result;
    }
}
