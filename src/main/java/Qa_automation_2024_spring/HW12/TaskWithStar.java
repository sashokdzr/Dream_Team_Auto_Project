package Qa_automation_2024_spring.HW12;
//Создать список из 30 или более случайных слов (например, можно воспользоваться https://randomwordgenerator.com/ ).
//        Напечатать из этого списка самые длинные слова, начинающиеся на каждую букву. Т.е. если, к примеру, в списке есть слова,
//        начинающиеся на a, b, d, f, то надо напечатать самое длинное слово на a, самое длинное на b, на d и нa f.

import java.util.*;

public class TaskWithStar {
    private static final List<String> randomWords = List.of(
            "colorful", "sequence", "shark",
            "ranch", "remunerate", "utter", "aquamanaquamanaquaman",
            "tape","stamp","cafe", "garfield",
            "global","mark","miracle",
            "leaf","sentiment","goal",
            "detail","quarter","finished",
            "draft","orientation","tempt",
            "tribe","disturbance","circulation",
            "dress","prosecute","flourish",
            "poem","acquaintance","lifestyled", "lifecycler");

    public static Map<String, Integer> countLength() {
        Map<String, Integer> sizes = new HashMap<>();
        for (String word:randomWords){
            String letter = String.valueOf(word.charAt(0));
            if (sizes.get(letter) == null || sizes.get(letter) < word.length()){
                sizes.put(String.valueOf(word.charAt(0)), word.length());
            }
        }
        return  sizes;
    }
    public static List<String> getWords() {
        List <String> words = new LinkedList<>();
        for (var entry : countLength().entrySet()){
            for (String str: randomWords){
                if (entry.getKey().equals("" + str.charAt(0)) && entry.getValue() == str.length()){
                    words.add(str);
                }
            }
        }
        return  words;
    }

}
