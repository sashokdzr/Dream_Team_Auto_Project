package Codewars;

import java.util.Arrays;

public class TheOffice {
    class  Pers {
        final String name;    // team memnber's name
        final int happiness;  // happiness rating out of 10

        Pers(String name, int happiness) {
            this.name = name;
            this.happiness = happiness;
        }
    }
    public static String outed(Pers[] meet, String boss) {
        int tempSum = Arrays.stream(meet).mapToInt(i->i.happiness).sum();
        int bossScore = Arrays.stream(meet).filter(i->i.name == boss).mapToInt(i-> i.happiness).sum();
        return (tempSum + bossScore) * 1.0 /meet.length <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }
}
