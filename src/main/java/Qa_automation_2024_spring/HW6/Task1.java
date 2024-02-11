package Qa_automation_2024_spring.HW6;
//Задача №1
//
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//        Для указанной строки ответ будет “ооооо” (или в столбик)

public class Task1 {
    public  static String task1(String s, char o){
        String res="";
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == o){
                res += o;
            }

        }
        return res;
    }
}
