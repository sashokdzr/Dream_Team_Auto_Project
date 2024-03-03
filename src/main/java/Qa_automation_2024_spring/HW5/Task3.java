package Qa_automation_2024_spring.HW5;
//Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.

public class Task3 {
    public static int arrMin(int[] arr){
        int min = arr[0];
        for (int i:arr){
            if (i<min){
                min = i;
            }
        }
        return min;
    }
}
