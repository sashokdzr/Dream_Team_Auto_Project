package Qa_automation_2024_spring.HW6;
//Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

public class Task4 {
    public static int countLines(String[][] arr, String e) {
        int counter = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains(e)) {
                    break;
                }
                counter++;
            }
        }
        return counter;
    }
}
