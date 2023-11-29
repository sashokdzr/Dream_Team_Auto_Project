package Codewars;

import java.util.List;
import java.util.stream.Collectors;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(Integer.class);

    }
    public static List<Object> filterList(final List<Object> list) {
        return list.stream()
                .filter(x -> x instanceof Integer)
                .collect(Collectors.toList());

    }
}
