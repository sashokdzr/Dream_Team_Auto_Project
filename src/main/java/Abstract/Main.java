package Abstract;

public class Main {
    public static void main(String[] args) {
        Phone iphone = new Iphone(1900, 1200, 3);
        iphone.unblock();
        iphone.getDisplaySize();
        iphone.takePhoto();

        Phone android = new Android(800,600, 8);
        android.unblock();
        android.getDisplaySize();
        android.takePhoto();
    }

}
