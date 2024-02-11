package Codewars;

public class TrueFalse {
    public static void main(String[] args) {
        ifEven(3);
    }
    public static void ifEven(int a){
        System.out.printf("a is even: %b", a%2==0);
    }
}
