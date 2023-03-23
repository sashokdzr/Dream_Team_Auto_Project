package Streams;
//Given an array of integers.
//
//        Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//
//        If the input is an empty array or is null, return an empty array.
//
//        Example
//        For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].


import java.util.Arrays;



class train {
    public static void main(String[]args){
        int[] input = null;
        System.out.println(Arrays.toString(countPositivesSumNegatives(input)));
    }

    @Override
    public String toString() {
        return "train{}";
    }

    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null) return new int[]{};

        int first = (int)Arrays.stream(input)
                .filter(x->x>0)
                .count();

        int second = (int)Arrays.stream(input)
                .filter(x->x<0)
                .sum();

        int[] res = new int[]{first, second};
        if (Arrays.stream(res).allMatch(x->x==0)) {
            return new int[]{};
        }
        else return res;
 //return an array with count of positives and sum of negatives
    }
}
