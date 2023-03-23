package Codewars;

import java.util.Arrays;

class SpeedControl {
    public static void main(String[] args) {
        double[] x = {1.2};
        System.out.println(gps(15,x));
    }
    public static int gps(int s, double[] x) {
        double[] delta= new double[x.length];
        for (int i=0; i< x.length-1; i++){
                delta[i]=(3600*Math.abs(x[i]-x[i+1]))/s;
        }
        Arrays.sort(delta);
        return x.length<=1?0:(int)Math.floor(delta[delta.length-1]);
    }
}
