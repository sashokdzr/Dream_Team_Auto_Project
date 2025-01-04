package Codewars;

public class UpperLower {
    public static String solve(final String str) {
                long countUppercase = str.chars().filter(i-> i <= 90).count();
        long countLowercase = str.chars().filter(i-> i >= 97).count();
        return countUppercase > countLowercase? str.toUpperCase() : str.toLowerCase(); //your code here
    }
}
