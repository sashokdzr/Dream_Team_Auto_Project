class FourMethods {
    public static void main(String[] args) {
        System.out.println(FourMethods.sum(1,2));
        System.out.println(FourMethods.subtraction(1,2));
        System.out.println(FourMethods.multiplication(1,2));
        System.out.println(FourMethods.division(1,2));

    }
    public static int sum (int a, int b){
        return a+ b;
    }
    public static int subtraction (int a, int b){
        return a-b;
    }
    public static int multiplication (int a, int b){
        return a*b;
    }
    public static double division (int a, int b){
        return (double)a/b;
    }

}
