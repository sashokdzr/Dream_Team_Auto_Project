package Codewars;
//НОД algorithm
public class ReduceMyFraction {
    public static int[] myFraction(int[] fractions){
        int a= fractions[0];
        int b=fractions[1];
        return new int[]{a/(gcd(a,b)), b/(gcd(a,b))};
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
