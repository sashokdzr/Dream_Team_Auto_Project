package Codewars;

//Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
//11223333445

import java.util.Arrays;

class OddIntegers {
    public static void main(String[] args) {
        int[] a = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(findIt(a));
    }
    //223344455
    public static int findIt(int[] a) {
        int odd = 0;
        Arrays.sort(a);
        if (a.length>1) {
            for (int i = 1; i < a.length - 1; i += 2) {
                if (a[i] != a[i - 1]) {
                    return a[i - 1];
                }
                if (i== a.length-2){
                    odd = a[a.length - 1];
                }
            }
        }
        else{
            odd = a[0];
        }

        return odd;
    }
}
