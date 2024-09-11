package Codewars;

public class RockOff {
    public static void main(String[] args) {
        System.out.println(solveRockOff(new int[]{47, 67, 22}, new int[]{26, 47, 12}));
    }
    public static String solveRockOff(final int[] alice, final int[] bob)
    {
        int[] res = new int[2];
        for (int i=0; i<3; i++) {
            if (alice[i] - bob[i] > 0) {
                res[0]++;
            } else if (alice[i] - bob[i] < 0) {
                res[1]++;
            }
        }
        String result = String.format("%d, %d: Alice made \"Kurt\" proud!", res[0], res[1]);
        String result2 = String.format("%d, %d: Bob made \"Jeff\" proud!", res[0], res[1]);
        String result3 = String.format("%d, %d: that looks like a \"draw\"! Rock on!", res[0], res[1]);

        switch (res[0] - res[1]) {
            case 1, 2, 3 -> {
                return result;
            }
            case -3, -2, -1 -> {
                return result2;
            }
            default -> {
                return result3;
            }
        }

    }
}
