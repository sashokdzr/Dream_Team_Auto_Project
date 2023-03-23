package Codewars;

import java.util.ArrayList;
import java.util.List;

class Vovels {
    public static void main(String[] args) {
        String st = "Hello World";
        System.out.println(swap(st));
    }
    public static String swap(String st) {
        char[]  vowels = {'a','e','i','o','u'};
        String tempStr = "";
        String str = "";
        for (int i=0; i<st.length(); i++ ){
            for (int j=0; j<vowels.length; j++){
                if (st.charAt(i)==vowels[j]){
                    str = (st.charAt(i)+"").toUpperCase();
                    break;
                }
                else {str = st.charAt(i)+"";}
            }
            tempStr +=str;
        }
        return tempStr;

    }
}
