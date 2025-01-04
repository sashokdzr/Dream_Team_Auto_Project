package Codewars;

import java.util.Arrays;

public class Elrctions {
    public static void main(String[] args) {
        System.out.println(find(new int[]{2, 3, 5, 2}, 3));
    }
    //{1,1,1,2,6,6} 0
    static int find(final int[] votes, final int k) {
        Arrays.sort(votes);
        int counter = 1;
        for (int i=votes.length-2; i>=0; i--){
            if(votes[votes.length-1] - votes[i] < k){
                counter++;
            }
            else break;
        }
        return (k == 0 && votes[votes.length-1] - votes[votes.length-2] == 0)? 0 : counter;
    }
}
