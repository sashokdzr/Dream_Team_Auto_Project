public class test2 {
    public static void main(String[] args) {
        test1 t = new test1();
        System.out.println(t.getMinIntValue());
        System.out.println(t.getMaxIntValue());
        System.out.println(t.getMaxIntValue() + t.getMinIntValue());
        t.setMin(1);
        System.out.println(t.getMinIntValue());
        System.out.println(t.getMaxIntValue());
        System.out.println(t.getMaxIntValue() + t.getMinIntValue());

    }
}
