package Codewars;

public class CompareStringsbySumofChars {
        public static boolean compare(String s1, String s2) {
            int sum1 = 0;
            int sum2 = 0;
            if (s1 != null) {
                s1 = s1.toUpperCase();
                char[] arrS1 = s1.toCharArray();
                for (char i : arrS1) {
                    if (65 <= i && i <= 90) {
                        sum1 += i;
                    }
                    else {sum1=0;
                        break;}

                }
            }
            if (s2 != null) {
                s2 = s2.toUpperCase();
                char[] arrS2 = s2.toCharArray();
                for (char j : arrS2) {
                    if (65 <= j && j <= 90) {
                        sum2 += j;
                    }
                    else {sum2=0;
                        break;}
                }
            }
            return sum1 == sum2;
        }
}
