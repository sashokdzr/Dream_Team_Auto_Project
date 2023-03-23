package HW13;

//Создать лист со значениями от 100 до 1000.
//Удалить из листа, созданного в предыдущей задаче, все четные элементы.

import java.util.ArrayList;
import java.util.List;

class Task2 {
    public static void main(String[] args) {

        System.out.println(createList(100, 200));
        System.out.println(getListWithoutEven(createList(100,200)));
        System.out.println(getListWithoutEven2(createList(100,200)));
    }

    public static List<Integer> createList(int a, int b) {
        List<Integer> list = new ArrayList<>();
        for (int value = a; value <= b; value++) {
            list.add(value);
        }
        return list;
    }

    public static List<Integer> getListWithoutEven(List<Integer> list){
        list.removeIf(p->p%2==0);
        return list;
    }

    public static List<Integer> getListWithoutEven2(List<Integer> list){
        List<Integer> temp = new ArrayList<>();
        for (Integer val:list)
            if (val % 2 == 0){
                continue;
            }
            else{
            temp.add(val);
            }
        return temp;
    }

}