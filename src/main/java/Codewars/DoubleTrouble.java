package Codewars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleTrouble {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(trouble(new int[]{13, -93, -31, -57, -57, -31, -25, 60, 91, 42, 74, -162, 66, -1, -95, -87, 29, 50, 7}, -88)));
    }
    public static int[] trouble(int[] x, int t) {
        List<Integer> temp = Arrays.stream(x).boxed().collect(Collectors.toList());
        int counter;
        do { counter = 0;
            for (int i = 1; i < temp.size(); i++) {
                if (temp.get(i - 1) + temp.get(i) == t) {
                    temp.remove(i);
                    i--;
                    counter++;
                }
            }
        }
        while (counter !=0);
        int[] result = new int[temp.size()];
        for (int i=0; i<temp.size(); i++){
            result[i] = temp.get(i);
        }

        return result;
    }
}
