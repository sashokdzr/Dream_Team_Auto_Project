package Codewars;

class PadowanNumbers {
    public static void main(String[] args) {
        System.out.println(padovan(0));
    }
    public static long padovan(int n) {
        long[] padovan = new long[n+3];
        padovan[0]=1;
        padovan[1]=1;
        padovan[2]=1;
        for (int i=3; i<=n; i++){
            padovan[i] = padovan[i-2] + padovan[i-3];
        }
        return padovan[n];
    }
}
