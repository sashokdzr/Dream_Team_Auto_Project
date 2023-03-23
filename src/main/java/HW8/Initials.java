package HW8;

import java.util.Locale;

class Initials {


    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        return sum;

    }

    public static void main(String[] args) {
        String one = "abc";
        String two = "def";
        String three = "ghp";
        System.out.println(tripleTrouble(one, two, three));
        String beast = "great blue heron";
        String dish = "garlic nann";
        System.out.println(feast(beast, dish));

        for (int i = 0; i < reverse(5).length; i++) {
            System.out.print(reverse(5)[i]);
        }

    }

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result = result + one.substring(i, i + 1) + two.substring(i, i + 1) + three.substring(i, i + 1);
        }
        return result;
    }

    public static boolean feast(String beast, String dish) {
        int indexOflastSymbolBeast = beast.length() - 1;
        int indexOflastSymbolDish = dish.length() - 1;
        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(indexOflastSymbolBeast) == dish.charAt(indexOflastSymbolDish))
            ;
        return true;

    }

    public static Integer basicMath(String op, int v1, int v2) {
        return op == "+" ? v1 + v1 : op == "-" ? v1 - v2 : op == "*" ? v1 * v2 : v1 / v2;
    }

    public static int[] reverse(int n) {
        //your code
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            arr[n - i] = i;
        }
        return arr;
    }

    public static String[] stringToArray(String s) {
        String[] words;
        words = s.split(" ");
        //your code;
        return words;
    }
    public static String correct(String string) {
        String temp = string;
        temp = string.replace('1','I');
        temp = string.replace('0','O');
        temp = string.replace('5','S');
        return temp;
    }




}

