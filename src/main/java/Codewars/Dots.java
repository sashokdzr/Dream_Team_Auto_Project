package Codewars;

import java.util.Arrays;

public class Dots {
    public static void main(String[] args) {
        System.out.println(calc("..... // .."));
    }
    public static String calc(String txt){
        String[] arr = txt.split(" ");
        int firstNumber = arr[0].length();
        int secondNumber = arr[2].trim().length();
        String action = arr[1].trim();
        return switch(action){
            case "+" -> format(firstNumber + secondNumber);
            case "-" -> format(firstNumber - secondNumber);
            case "*" -> format(firstNumber * secondNumber);
            default -> format(firstNumber / secondNumber);
        };
    }

    static String format(int n) {
        return ".".repeat(n);
    }

}
