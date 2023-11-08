package Codewars;

import java.util.Arrays;

public class pipes {
    public static void main(String[] args) {
        int[] num = new int[] {1,2,3,5,6,8,9};
        System.out.println(Arrays.toString(pipeFix(num)));
    }
    public static int[] pipeFix(int[] numbers) {
        int size = numbers[numbers.length-1] - numbers[0] + 1;
        int[] res = new int[size];
        int j=0;
        for (int i=numbers[0]; i<=numbers[numbers.length-1]; i++){
            res[j] = i;
            j++;
        }
        return res;
        // Fix the pipes!
    }
}
