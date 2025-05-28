package Codewars;

import java.util.stream.IntStream;

public class numberSquare {
    public static void main(String[] args) {
        System.out.println(differenceOfSquares(5));
    }
    public static int differenceOfSquares(int n){
        return (int)Math.pow(IntStream.range(1,n+1).sum(),2) - IntStream.range(1,n+1).map(i->i*i).sum();
    }
}
