package Codewars;

import java.util.ArrayList;
import java.util.List;


public class RemoveTheMinimum {
    public static int[] removeSmallest(int[] numbers) {
        if (numbers.length == 0){
            return numbers;
        }
        int[] res = new int[numbers.length-1];
        List<Integer> indexes = new ArrayList<>();
        List<Integer> tempResult = new ArrayList<>();
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] == findMin(numbers)){
                indexes.add(i);
            }
        }
        for (int i=0; i<numbers.length; i++){
            if (i != indexes.get(0)){
                tempResult.add(numbers[i]);
            }
        }
        for (int i=0; i<res.length; i++){
            res[i] = tempResult.get(i);
        }
        return res;
    }

    public static int findMin(int[] number){
        int min = number[0];
        for(int k: number){
            if (k<min){
                min = k;
            }
        }
        return min;
    }
}
