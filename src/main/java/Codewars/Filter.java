package Codewars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Filter {
    public static Object[] removeEveryOther(Object[] arr) {

        Object[] res = IntStream.range(0, arr.length)
                .filter(n -> n % 2 == 0)  //3 - каждый 3-ий элемент
                .mapToObj(x -> arr[x])
                .collect(Collectors.toList())
                .toArray();
        return res;
    }

    public static String shortenToDate(String longDate) {
        //Friday May 2, 7pm
        String[] temp = longDate.split(",");
        return temp[0];
    }

    static String encode(String word){
        word = word.toLowerCase();
        for (int i=0; i<word.length(); i++){
            char temp = word.charAt(i);
            //if (temp != ')' && temp != '(')
                word = word.replaceFirst(word.charAt(i)+"", "*");
            //else continue;
            if (word.contains(temp + "")) {
                word = word.replaceAll(temp+"", "1");
                word = word.replace("*", "1");
            }
            else word = word.replace("*", "2");
        }
        return word;
    }
    public static double twoDecimalPlaces(double number)
    {
        //Write your code here
        int res = (int) (number * 100);
        number = ((double) res) /100;
        return number;
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
        System.out.println(twoDecimalPlaces(14.678));
    }
//Left side
//    w - 4
//    p - 3
//    b - 2
//    s - 1
//    Right side
//    m - 4
//    q - 3
//    d - 2
//    z - 1

    public static String alphabetWar(String fight){
        int left=0;
        int right=0;
        String ls = "sbpw";
        String rs = "zdqm";
        for (int i=0; i<=fight.length(); i++){
            if (ls.contains(fight.charAt(i)+"")){
                left += ls.indexOf(fight.charAt(i))+1;
            } else if (rs.contains(fight.charAt(i)+"")) {
                right += rs.indexOf(fight.charAt(i))+1;
            }
            else;
        }
        return left>right?"Left side wins!":right>left?"Right side wins!":"Let's fight again!";
    }
}
