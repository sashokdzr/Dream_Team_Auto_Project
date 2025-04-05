import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        int[] arr22 = {1,12,3,4,8,9,12};
        Arrays.sort(arr22);
        int index = arr22.length-1;
        while (arr22[index] == arr22[index-1]){
            index--;
        }
        System.out.println(arr22[index-1]);

        System.out.println(Arrays.stream(arr22).reduce(Math::max).getAsInt());
        List<Integer> list = List.of(1,2,5,9,13,9,12);
        System.out.println(list.stream().reduce((a,b) -> a>b? a: b).orElse(0));
        System.out.println(list.stream().reduce(0,(a,b) -> a>b? a: b));
        String str = "Hello world";

    }

}
