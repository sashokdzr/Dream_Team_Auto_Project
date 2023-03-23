// Tadashi
// Takahiro
// Takao
// Takashi
// Takayuki
// Takehiko
// Takeo
// Takeshi
// Takeshi




package Codewars;

import java.util.Arrays;
import java.util.Collections;

class Suzukistudents {
    public static void main(String[] args) {
        String string = "Tadashi Takahiro Takao Takashi Takayuki Takehiko Takeo Takeshi Takeshi";
        String [] mass = lineupStudents(string);
        for (String i:mass){
            System.out.println(i);
        }
    }

    public static String[] lineupStudents(String students)
    {
        String[] res = students.split(" ");
        Arrays.sort(res, Collections.reverseOrder());

        for (int j=0; j< res.length; j++){
        for(int i=0; i<res.length-1; i++) {
            if (res[i + 1].length() > res[i].length()) {
                String temp = "";
                temp = res[i];
                res[i] = res[i + 1];
                res[i + 1] = temp;
            }
        }

        }

        return res;
    }
}
