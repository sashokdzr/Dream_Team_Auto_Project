package Codewars;

public class Isthisatriangle {
    public static void main(String[] args) {
        System.out.println(isTriangle(4,5,6));
    }
    public static boolean isTriangle(int a, int b, int c){
        String str1 = " ";
        str1.matches("[0-9]");
        return a+b>c && b+c>a && a+c>b;

    }
}