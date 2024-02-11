package Qa_automation_2024_spring.HW6;
//Задача №3
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

public class Task3 {
    public static String subtr(String s, String sbstr){
        s = s.toLowerCase();
        String res="";
        for (int i=0; i<s.length() - sbstr.length() +1; i++){
            if (s.substring(i, i + sbstr.length()).equals(sbstr)){
                res+=i + " ";
            }
        }
        return res;
    }
}
