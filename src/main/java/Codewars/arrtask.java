package Codewars;

public class arrtask {
    public static void main(String[] args) {
        System.out.println(createArrayOfTiers(6));
    }
    public static String[] createArrayOfTiers(int num) {
        if (num == 0){
            return new String[]{"0"};
        }
        int arrayLength = String.valueOf(num).length();
        String[] result = new String[arrayLength];
        int i=1;
        while (num>1){
            result[arrayLength-i]=""+ num;
            i++;
            num=num/10;
        }
        // your code goes here
        return result;
    }
}
