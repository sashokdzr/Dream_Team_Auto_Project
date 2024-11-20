package Codewars;

public class BinaryAddition {

    public static void main(String[] args) {
        System.out.println(binaryAddition(1,2));
    }
    public static String binaryAddition(int a, int b){
        String result = "";
        int digitSum = a + b;
        while (digitSum>=1){
            int temp = digitSum%2;
            result=temp+result;
            digitSum = digitSum / 2;
        }
        //your code here
        return result;
    }
}
