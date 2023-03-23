package Codewars;

import java.util.Arrays;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple){
        Arrays.sort(triple);
        int a = triple[0];
        int b = triple[1];
        int c = triple[2];
        return Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)?1:0;
    }


    }
