package Codewars;

public class Solution {
    public static void main(String[] args) {
        int[] res = solve(22,5);
        System.out.println(res[0]+" "+res[1]);
    }
    public static int [] solve(int a, int b){
        if (a==0 || b==0){
            return firstCase(a,b);
        }
        if (a>=2*b){
            return secondCase(a,b);
        }
        if (b>=2*a){
            return thirdCase(a,b);
        }
        else{
            return firstCase(a,b);
        }
    }
    public static int[] firstCase(int a, int b){
        return new int[]{a,b};
    }
    public static int[] secondCase(int a, int b){
        return firstCase(a-2*b, b);
    }

    public static int[] thirdCase(int a, int b){
        return firstCase(a, b-2*a);
    }
}
