package Codewars;
public class Arahnophobia {
    public static String drawSpider(int legSize, int bodySize, char mouth, char eye) {
        int eyeCounter = (int)Math.pow(2,bodySize);
        String legs = switch (legSize) {
                case 1 -> "^ ^";
                case 2 -> "/\\ /\\";
                case 3 -> "/╲ ╱\\";
                default -> "╱╲ ╱╲";
        };
        String body = "(".repeat(bodySize) + " " + ")".repeat(bodySize);
        String eyeMouth = (""+eye).repeat(eyeCounter / 2) + mouth + (""+eye).repeat(eyeCounter / 2);
        return legs.replace(" ", body).replace(" ", eyeMouth);
    }
}
