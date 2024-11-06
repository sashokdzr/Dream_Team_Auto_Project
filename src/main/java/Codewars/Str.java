package Codewars;

import javax.xml.stream.events.Characters;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Str {
    public static String vaporcode(String s) {
        return s.toUpperCase().replaceAll(" ","").chars().mapToObj(c->String.valueOf((char) c)).collect(Collectors.joining("  "));
    }
}
