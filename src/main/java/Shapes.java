class Shapes {
    public static void main(String[] args) {
        figure1();
        System.out.println();
        figure2();
        System.out.println();
        figure3();
    }
    public static void figure1(){
        for (int j=10; j>0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void figure2(){
        for (int j=10; j>0; j--) {
            for (int i=j; i<10; i++){
                System.out.print("  ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void figure3(){
        for (int j=10; j>0; j--) {
            for (int i=j; i<10; i++){
                System.out.print("  ");
            }
            for (int i = j-1; i >= 1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
