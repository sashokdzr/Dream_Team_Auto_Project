package HW6BEginners.Part2;

class Task16 {
    public static void print1(int n, int m, int l) {
        for (int i = n; i < l; i += m) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

    public static void print2(int start, int step, int length) {
        int k = 1;
        while (k <= length) {
            if (start % 2 == 1) {
                System.out.print(start + " ");
                k += 1;
            }
            start += step;

        }
    }

    public static void main(String[] args) {
        print1(12, 7, 99);
        System.out.println();
        print2(12, 5, 12);

    }
}
