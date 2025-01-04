package Codewars;

import java.util.Arrays;
import java.util.stream.Stream;

public class IsOss {
    public static int oddOne(int[] arr){
        for (int i=0; i<arr.length; i++){
            if (i%2!=0){
                return i;
            }
        }
        return -1;
    }
}
