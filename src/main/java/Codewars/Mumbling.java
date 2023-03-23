/*accum("abcd") -> "A-Bb-Ccc-Dddd"
        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
        accum("cwAt") -> "C-Ww-Aaa-Tttt"*/

package Codewars;

import java.util.Locale;

class Mumbling {
    public static void main(String[] args) {
        System.out.println(accum("AfgT"));
    }
    public static String accum(String s) {

        var temp1 = "String";
        var char1 = 'd';


        String temp;
        String result="";
        for (var i=0; i<s.length(); i++ ){
            temp ="" + s.charAt(i);
            result+=(temp.toUpperCase()+temp.toLowerCase().repeat(i))+"-";
        }
        return result.substring(0, result.length()-1);
    }
}
