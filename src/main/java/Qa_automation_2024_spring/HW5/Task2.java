package Qa_automation_2024_spring.HW5;
//Задача №2
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

public class Task2 {
    public static int arrMax(int[] arr){
        int max = arr[0];
        for (int i:arr){
            if (i>max){
                max = i;
            }
        }
        return max;
    }
}
