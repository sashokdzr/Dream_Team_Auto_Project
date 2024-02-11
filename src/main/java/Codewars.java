import java.util.Arrays;

class Codewars {
    public static void main(String[] args) {
        System.out.println(amountOfPages(100000));
    }
    public static int amountOfPages(int summary) {
        String s="";
        for (int i=1; i<=summary; i++){
            s+=i;
        }
        return s.length();
    }
}
