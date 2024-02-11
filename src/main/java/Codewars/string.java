package Codewars;
import java.util.ArrayList;
import java.util.List;
public class string {
    public static void main(String[] args) {
        List<String> arr = List.of("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        System.out.println(containAllRots("XjYABhR", arr));
    }


        public static boolean containAllRots(String strng, List<String> arr) {
            for (int i=0; i<strng.length(); i++) {
                if (arr.contains(strng)){

                    strng = strng.substring(1) + strng.charAt(0);

                }
                else {
                    return false;
                }
            }
            return true;
    }
}
