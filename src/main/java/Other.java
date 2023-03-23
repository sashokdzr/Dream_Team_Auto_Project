class Other{
    static boolean result (boolean a, boolean b){
        return !(a&&b);
    }

    public static void main(String[] args) {
        System.out.println(result(true, false));
    }
}
