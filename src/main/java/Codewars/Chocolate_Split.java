package Codewars;



class Chocolate_Split {

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(49, 51));
    }

    public static int dontGiveMeFive(int start, int end) {



        int k = 0;
        for (int i = start; i <= end; i++) {
                String t = "" + i;
                if (t.contains("5")){
                    continue;
                }
            k++;
        }
        return k;
    }
}



