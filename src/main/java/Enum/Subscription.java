package Enum;

public class Subscription {
    public static void main(String[] args) {
        Sub sub = new Sub();

        sub.state = Sub.State.SUSPENDED;

        switch (sub.state) {
            case ACTIVE:
                System.out.println("1");
                break;
            case NONE:
                System.out.println("0");
                break;
            case SUSPENDED:
                System.out.println("2");
                break;
        }

    }

}
class Sub{
    State state;
    enum State{
        ACTIVE, NONE, SUSPENDED
    }
}
