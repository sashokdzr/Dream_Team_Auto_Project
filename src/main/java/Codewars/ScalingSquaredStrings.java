package Codewars;

public class ScalingSquaredStrings {
    public static void main(String[] args) {
        System.out.println(scale("abcd\nefgh\nijkl\nmnop", 2, 3));
    }
    public static String scale(String strng, int k, int v) {
        String tempRes="";
        String res ="";
        String[] temp = strng.split("\n");
        for (String i: temp){
            String[] temp1 = i.split("");
            tempRes="";
            for (String o:temp1){
                tempRes += o.repeat(k);
            }
            tempRes += "\n";
            res += tempRes.repeat(v);
        }
        return res.substring(0, res.length()-1); // your code
    }
}
