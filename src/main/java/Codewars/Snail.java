package Codewars;

public class Snail {
    public static void main(String[] args) {
        System.out.println(Snail.canSnailReachEnd(100, 1, 2));
    }
    public static boolean canSnailReachEnd(double length, double speed, double lengthIncreases) {
        //code
        return speed<lengthIncreases? false : length * 1.00 / (speed-lengthIncreases) < 365*24*60*1.00;
    }
}
