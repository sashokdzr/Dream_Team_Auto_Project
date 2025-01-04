package Codewars;

import java.util.stream.Collectors;

public class Str {
    public static String vaporcode(String s) {
        return s.toUpperCase().replaceAll(" ","").chars().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining("  "));
    }
}
