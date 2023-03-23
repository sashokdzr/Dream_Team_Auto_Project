class Fibonacci {
    public static void main(String[] args) {
        System.out.println(returnLastDigit(50004));
    }


    public static double returnLastDigit(int f){
        double x = 1;
        double y = 1;
        double ans = 0;
        if (f<=2){
            return 1;
        }
        for (int i=2; i<f; i++){
            ans = x+y;
            x=y;
            y=ans;
        }
        return ans;
    }
}