package Codewars;

public class covfefe {
    public static void main(String[] args) {
        System.out.println("tweet".indexOf("we"));
    }
    public static String covfefe(String tweet) {
        return tweet.contains("coverage") ? tweet.replaceAll("coverage", "covfefe") : tweet.concat(" covfefe");

    }
}
