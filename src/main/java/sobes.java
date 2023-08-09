import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class sobes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        System.out.println("Введите значения массива через запятую");
        input = scanner.nextLine();
        Arrays.stream(input.split(","))
                .mapToDouble(Double::parseDouble)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);
    }
}
