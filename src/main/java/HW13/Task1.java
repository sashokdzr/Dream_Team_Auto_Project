package HW13;

// Создать лист и добавить в него следующие слова:
  //      White.
    //    Tan.
      //  Yellow.
//        Orange.
  //      Red.
    //    Pink.
//        Purple.
  //      Blue.
    //    Затем удалить из этого списка все цвета в которых встречается буква “L”


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Task1 {
    public static String REMOVE_WORD_WITH_LETTER = "l";

    public static void main(String[] args) {
        printList(removeLetter(createList(), REMOVE_WORD_WITH_LETTER.toUpperCase(Locale.ROOT)));
    }

    public static List<String> createList() {
        List<String> colorList = new ArrayList<>();
        colorList.add("White");
        colorList.add("Tan");
        colorList.add("Yellow");
        colorList.add("Orange");
        colorList.add("Red");
        colorList.add("Pink");
        colorList.add("Purple");
        colorList.add("Blue");
        return colorList;
    }

    public static List<String> removeLetter(List<String> list, String l){
        List<String> temp = new ArrayList<>();
        for (String color:list){
            if (color.toUpperCase().contains(l)) {
                continue;
            }
            else{
                temp.add(color);
            }
        }
        return temp;
    }

    public static void printList(List<String> temp){
        for (String word:temp) {
            System.out.println(word);
        }
    }



}
