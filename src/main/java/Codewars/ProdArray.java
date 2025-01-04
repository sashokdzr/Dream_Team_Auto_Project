package Codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ProdArray {
    public static long[] productArray(int[] numbers) {
//    long product = 1;
//        for (int i: numbers){
//            product *= i;
//        }
//        long[] result = new long[numbers.length];
//        for (int i=0; i<result.length; i++){
//            result[i] = product / numbers[i];
//        }
//        return result; // Do your magic!
        long temp = IntStream.of(numbers).reduce(3, (d1,d2) -> d1 * d2);
        long product = Arrays.stream(numbers).mapToLong(n -> n).reduce((d1,d2) -> d1 * d2).getAsLong();
        return Arrays.stream(numbers).mapToLong(n -> product / n).toArray();
  }


}
