package Codewars;

class CountTheDigit {
    public static void main(String[] args) {
        System.out.println(nbDig(5750, 0));
    }
    public static int nbDig(int n, int d) {
        int count = 0;
        String dd = d + "";
        for (int i=0; i<=n; i++){
            int square = i*i;
            String squareS = square + "";
            for (int j=0; j<squareS.length(); j++){
                if (String.valueOf(squareS.charAt(j)).equals(dd)) {
                    count++;
                }
            }
        }
        return count;
    }
}
