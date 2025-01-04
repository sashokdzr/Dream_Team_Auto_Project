package Codewars;

public class LuckyNumber {

    public static boolean isLucky(long n) {
        String temp = Long.toString(n);
        char[] ArrTemp = temp.toCharArray();
        int sum = 0;
        for (char i:ArrTemp){
            sum += Character.getNumericValue(i);
        }
        return sum % 9 == 0;

        // is n lucky?
    }
}
