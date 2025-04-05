import java.util.stream.Stream;

public class test1 {

    public static void main(String[] args) {
        String s = "123";
        Stream.of(s.split("")).map(i->Integer.parseInt(i)).reduce(0,Integer::sum );
        ("" + Math.abs(-123)).chars().map(i -> i - '0').sum();
    }
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
