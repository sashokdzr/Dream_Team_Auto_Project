package Qa_automation_2024_spring.HW5;


public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] array1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        System.out.printf("Task 1: sum of array = %d\n", Task1.arrSum(array));
        System.out.printf("Task 2: max element = %d\n", Task2.arrMax(array));
        System.out.printf("Task 3: min element = %d\n", Task3.arrMin(array));
        System.out.printf("Task 4: mid = %f\n", Task4.mid(array));
        System.out.printf("Task 5: sum of array = %d\n", Task5.sum(array1));
        System.out.printf("Task 6: max element = %d\n", Task6.max(array1));
    }
}
