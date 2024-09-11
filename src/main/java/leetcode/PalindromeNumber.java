package leetcode;

import dev.failsafe.function.CheckedRunnable;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(19 / 10);
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = 0;
        List<Integer> list = new ArrayList<>();
        while ( x >= 10){
            temp = x % 10;
            list.add(temp);
            x =  x / 10;
        }
        list.add(x);
        for (int i = 0; i<list.size()/2; i++){
            if (list.get(i) != list.get(list.size()-i-1)) return false;
        }
        return true;
    }
}