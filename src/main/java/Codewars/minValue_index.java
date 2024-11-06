package Codewars;

import java.util.Arrays;

public class minValue_index {
    public static void main(String[] args) {
        System.out.println(findSmallest(new int[]{1, 2, 3, 0, 5}, "index"));
    }

    public static int findSmallest(int[] numbers, String mode) {
        Integer value = Arrays.stream(numbers).min().getAsInt();
        int index = Arrays.stream(numbers).boxed().toList().indexOf(value);
        return mode.equals("value") ? value : index;
    }
}
