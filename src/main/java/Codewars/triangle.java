package Codewars;

class triangle {
    public static void main(String[] args) {
        System.out.println(pattern(0));
    }

    public static String pattern(int n){
        String result ="";
        if (n==0)
            return result;
        else {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    result += i;
                }
                result += "k";
            }
            return result.substring(0, result.length() - 1);
        }
    }
}
