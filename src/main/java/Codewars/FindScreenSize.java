package Codewars;

import static java.lang.Integer.parseInt;

public class FindScreenSize {
    public static void main(String[] args) {
        System.out.println(findScreenHeight(686, "4:3"));
    }
    public static String findScreenHeight(int width, String ratio) {
            String[] str = ratio.split(":");
            int ratio1 = parseInt(str[0]);
            int ratio2 = parseInt(str[1]);
            int height = width * ratio2 / ratio1;
            return String.format("%dx%d",width, height);
    }
}
