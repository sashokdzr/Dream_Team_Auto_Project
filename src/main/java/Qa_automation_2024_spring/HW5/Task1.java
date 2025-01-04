package Qa_automation_2024_spring.HW5;
//Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.
public class Task1 {
    public static void main(String[] args) {
        arrSum(new int[]{1,2,3,4,5,6});
    }
    public static int arrSum(int[] arr){
        int sum = 0;
        for (int i:arr){
            sum+=i;
        }
        return sum;


    }
}
