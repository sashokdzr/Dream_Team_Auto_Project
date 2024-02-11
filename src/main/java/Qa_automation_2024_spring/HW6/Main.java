package Qa_automation_2024_spring.HW6;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Task1 output: " + Task1.task1("Перестановочный алгоритм быстрого действия", 'о') + "\n");
        System.out.printf("Task2 output: " + Task2.task2("Перевыборы выбранного президента", 'е') + "\n");
        System.out.printf("Task2 output: " + Task3.subtr( "Посмотрите как Рите нравится ритм в рит", "рит") + "\n");
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        System.out.printf("Task4 output: " + Task4.countLines(array, "е") + "\n");
        System.out.println("Task5 output: " + "\n" +
                            "     sum = " + Task5.sum(3,5) + "\n" +
                            "     sub = " + Task5.sub(3,5) + "\n" +
                            "     mul = " + Task5.mul(3,5) + "\n" +
                            "     div = " + Task5.div(3,5));


    }
}
