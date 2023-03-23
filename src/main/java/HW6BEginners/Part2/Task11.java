package HW6BEginners.Part2;

class Task11 {
    public static void print(int l){
        for (int i=0; i<l; i++){
            if (i%2==0) {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        print(25);
    }
}
