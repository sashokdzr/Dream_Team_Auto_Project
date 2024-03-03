package Qa_automation_2024_spring.HW5;
//Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

public class Task5 {
    public  static int sum(int[][] arr){
        int sum = 0;
        for (int i = 0; i< arr.length; i++){
            sum+=Task1.arrSum(arr[i]);
        }
        return sum;

    }
}
