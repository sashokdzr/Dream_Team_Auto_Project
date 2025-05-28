package Codewars;

import java.util.Arrays;

public class testtest {
    public static void main(String[] args) {
        int[] result = solve(new int[]{15, 10, 7, 12});
        System.out.println(result[0]+" "+result[1]+" "+result[2]+" "+result[3]);
    }
    public static int[] solve (int[] arr){
        Arrays.sort(arr);
        int[] result = new int[arr.length];
            for(int i=0, j=0; j<result.length-1; i++, j+=2){
                result[j]=arr[arr.length-1-i];
                result[j+1]=arr[i];
        }
        if (arr.length%2==1){
            result[arr.length-1] = arr[arr.length/2];
        }
        return result;
    }
}
