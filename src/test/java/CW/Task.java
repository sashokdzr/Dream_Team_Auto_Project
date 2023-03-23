package CW;

import java.util.*;

//Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.
  //      Example:
    //    Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
//String[] y = x.toArray(new String[0]);

class Task {
    public static int[] flattenAndSort(int[][] array) {
        List<Integer> tempRes = new ArrayList<Integer>();
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                tempRes.add(array[i][j]);
            }
        }
        Collections.sort(tempRes);
        int[] result = new int[tempRes.size()];
        for (int i=0; i<tempRes.size(); i++){
            result[i]= tempRes.get(i);
        }
        return result;


    }
}
