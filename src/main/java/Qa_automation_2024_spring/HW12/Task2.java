package Qa_automation_2024_spring.HW12;

import java.util.ArrayList;
import java.util.List;

//Создать лист со значениями от 100 до 1000.
public class Task2 {
    public static List<Integer> listOfNumbers(){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i<=1000; i++){
            numbers.add(i);
        }
        return numbers;
    }

    public static List<Integer> removeEvenNumbers(){
        List<Integer> numbers = listOfNumbers();
        for (int i = 0; i<listOfNumbers().size(); i++){
            if (listOfNumbers().get(i) % 2 == 0){
                numbers.remove(listOfNumbers().get(i));
            }

        }
        return numbers;
    }

}
