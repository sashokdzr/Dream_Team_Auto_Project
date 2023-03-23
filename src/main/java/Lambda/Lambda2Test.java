package Lambda;

import java.util.Arrays;

class Lambda2Test {
    public static void main(String[] args) {
        Sum<Integer> count = (Integer x, Integer y) -> x+y;
        Sum <String> concat = (String x, String y) -> x+y;
        System.out.println(count.sum(1,2));
        System.out.println(concat.sum("1","2"));

        int[] arr = {3,2,4,5,23,2,45,6,7,5,345,657,45,22,123,6,7,8,9,0};
        int[] arr1 = arr.clone();
        Arrays.sort(arr);
        System.out.println("max = " + arr[arr.length-1] +";");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

}
