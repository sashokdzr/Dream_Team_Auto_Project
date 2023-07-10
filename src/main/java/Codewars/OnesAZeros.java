package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Given an array of ones and zeroes, convert the equivalent binary value to an integer.
//
//        Eg: [0, 1, 0, 1] is treated as 0001 which is the binary representation of 1.
//0*2+0 + 0*2+1 + 1*2+0 + 2*2+1 = 5
public class OnesAZeros {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1,0,1,1,1))));
    }
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > Arrays.stream(classPoints).average().orElse(0);
    }
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int res = 0;
        for (int i=binary.size(); i>0; i--){
            res += Math.pow(2, Math.abs(binary.size())-i) * binary.get(i-1);
        }
        return res;
    }
}