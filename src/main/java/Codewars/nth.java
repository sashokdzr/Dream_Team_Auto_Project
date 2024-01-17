package Codewars;

public class nth {
    public static void main(String[] args) {
        System.out.println(seriesSum(9));
    }
    public static String seriesSum(int n) {
        double sum = 0;
        int k=1;
        for (int i=1; i<=n; i++){
            sum += (1.0/k);
            k+=3;
        }
        return Double.toString((Math.round(sum*100)/100.0));
        // Happy Coding ^_^
    }
}
