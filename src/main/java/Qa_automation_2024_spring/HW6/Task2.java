package Qa_automation_2024_spring.HW6;
//Задача №2
//
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

public class Task2 {
    public  static int task2(String s, char o){
        int counter = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == o){
                counter++;
            }

        }
        return counter;
    }
}
