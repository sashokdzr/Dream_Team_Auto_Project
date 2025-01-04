package Codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Arrays1 {
    /*
    Challenge:

Given a two-dimensional array of integers, return the flattened version of the array with all the integers in the sorted (ascending) order.

Example:

Given [[3, 2, 1], [4, 6, 5], [], [9, 7, 8]], your function should return [1, 2, 3, 4, 5, 6, 7, 8, 9].
     */


        public static int[] flattenAndSort(int[][] array) {
            List <Integer> reslist = new ArrayList<>();
            for (int[] i :array){
                for (int j:i){
                    reslist.add(j);
                }
            }
            int[] res = new int[reslist.size()];
            for (int i=0; i<res.length; i++){
                res[i]= reslist.get(i);
            }
            Arrays.sort(res);
            return res;

        }


    public static void main(String[] args) {
        int[][] arr = { {}, {2,3,6,7}, {2,3}};
        for (int k: flattenAndSort(arr)){
            System.out.print(k);
        }

    }

}

