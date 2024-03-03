package Qa_automation_2024_spring.HW5;
//Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

public class Task4 {
    public static double mid(int[] arr){
        return Task1.arrSum(arr)* 1.0 / arr.length;
    }
}
