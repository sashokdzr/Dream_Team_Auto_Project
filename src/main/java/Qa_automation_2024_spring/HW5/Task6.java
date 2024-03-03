package Qa_automation_2024_spring.HW5;
//Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

public class Task6 {
    public  static int max(int[][] arr){
        int max = arr[0][0];
        for (int i = 0; i< arr.length; i++){
            if (max < Task2.arrMax(arr[i])){
                max = Task2.arrMax(arr[i]);
            }
        }
        return max;
    }
}
