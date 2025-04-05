package Codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Determineifthepokerhandisflush {

    public static void main(String[] args) {
        System.out.println(CheckIfFlush(new String[] {"AS", "2S", "5S", "8S", "10S"}));
    }
    public static boolean CheckIfFlush(String[] cards){
        //Write some code here
        String s;
        List<Character> temp = Arrays.stream(cards).map(i -> i.charAt(i.length() - 1)).toList();
        Set<Character> tempSet = new HashSet<Character>();
//       temp.stream().map(tempSet::add);
        for (Character i:temp){
            tempSet.add(i);
        }
        return tempSet.size() == 1;
    }
}
