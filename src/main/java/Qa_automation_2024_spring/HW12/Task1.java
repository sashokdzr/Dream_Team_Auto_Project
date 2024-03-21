package Qa_automation_2024_spring.HW12;
//Создать лист и добавить в него следующие слова:
//White.
//        Tan.
//        Yellow.
//        Orange.
//        Red.
//        Pink.
//        Purple.
//        Blue.
//Затем удалить из этого списка все цвета в которых встречается буква “L”

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private static final String[] str = {"White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"};
    public static List<String> createList() {
        List<String> words = new ArrayList<String>();
        for (String s: str){
            words.add(s);
        }
        return  words;
    }

    public static List<String> removeWordWithLetter(){
        List<String> result = createList();
        for (String s:createList()){
            if (s.toLowerCase().contains("l")){
                result.remove(s);
            }
        }
        return result;
    }


}
