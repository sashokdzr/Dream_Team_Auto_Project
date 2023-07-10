package Codewars;
//Your task is to remove all consecutive duplicate words from a string, leaving only first words entries. For example:
//
//        "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
//
//        --> "alpha beta gamma delta alpha beta gamma delta"
//        Words will be separated by a single space. There will be no leading or trailing spaces in the string. An empty string (0 words) is a valid input.
public class RemoveConsecutiveDuplicateWords {
    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }
    public static String removeConsecutiveDuplicates(String s){
        String[] tempS = s.split(" ");
        String result = tempS[0] + " ";
        for (int i=1; i< tempS.length; i++){
           if (tempS[i].equals(tempS[i-1])){
               continue;
           }
           else{
               result += tempS[i]+ " ";
           }
        }
        return result.trim();
    }

}
