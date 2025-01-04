public class test1 {
    public int getMinIntValue() {
        return min;
    }

    public int getMaxIntValue() {
        return max;
    }

    private int min = Integer.MIN_VALUE;
    private int max = Integer.MAX_VALUE;

    public void setMin(int min) {
        this.min = min;
    }
}
