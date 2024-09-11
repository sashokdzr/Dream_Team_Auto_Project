package Codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HelptheFruitGuy {
    public static String[] removeRotten(String[] fruitBasket) {
        // code here
       return fruitBasket == null ?
               new String[] {}
               : fruitBasket.length == 0 ?
               fruitBasket : Arrays.stream(fruitBasket)
                .map(i -> i.contains("rotten") ?
                        i.toLowerCase().replace("rotten", "") : i)
                .toArray(String[]::new);
    }
}
