package Codewars;

import java.util.stream.IntStream;

//The police have placed radars that will detect those vehicles that exceed the speed limit on that road. If the driver's speed is 10km/h to 19km/h above the speed limit, the fine will be 100 dollars, if it is exceeded by 20km/h to 29km/h the fine will be 250 dollars and if it is exceeded by more than 30km/h the fine will be 500 dollars.
//
//        You will be provided with the speed limits of those roads with radar as a collection of speedlimits [90,100,110,120,....] and the speed of the driver will be the same on all roads and can never be negative and the amount of the fine will be accumulated example 95km/h.
//
//        Example (Speed=100, Signals=[110,100,80]-> 250)
public class SpeedLimit {
    public static void main(String[] args) {
        System.out.println(speedLimit1(130, new int[]{140,130,100}));
    }

    public static int speedLimit1(final int speed, final int[] signals) {
        return IntStream.of(signals).map(ex -> speed - ex).map(fine -> fine >= 30? fine=500: fine >= 20 ? fine=250: fine>=10? fine=100: 0).sum();
    }

    public static int speedLimit(final int speed, final int[] signals) {
        int[] arrExSpeed = new int[signals.length];
        for (int i = 0; i < signals.length; i++) {
            arrExSpeed[i] = speed - signals[i];
        }
        int sum = 0;
        for (int k : arrExSpeed) {
            if (k > 0) {
                if (k >= 30) {
                    sum += 500;
                } else if (k > 19) {
                    sum += 250;
                } else if (k >= 10) {
                    sum += 100;
                } else sum += 0;
            }
        }
        return sum;
    }
}
