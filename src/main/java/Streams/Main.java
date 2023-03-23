package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        System.out.println("//filter");
        //filter
        List<Car> filterByColor = getListOfCars().stream()
                .filter(Car->Car.getColor().equals("White"))
                .collect(Collectors.toList());
        filterByColor.forEach(System.out::println);
        System.out.println("//sort");
        //sort
        List<Car> sortByModel = getListOfCars().stream()
                .sorted(Comparator.comparing(Car::getModel).reversed().thenComparing(Car::getColor))
                .collect(Collectors.toList());
        sortByModel.forEach(System.out::println);
        System.out.println("//MAX");
        //MAX
        getListOfCars().stream()
                .max(Comparator.comparing(Car::getModel))
                .ifPresent(System.out::println);
        System.out.println("////MIN");
        ////MIN
        System.out.println(getMin());
        System.out.println("findBlackCar");
        //findBlackCar
        boolean findBlackCar = getListOfCars().stream()
                .anyMatch(Car->Car.getColor().equals("Black"));
        System.out.println(findBlackCar);
///////////////////////////////////////////////////////////
        System.out.println("///INTEGERS any match///");
        boolean res = getListOfIntegers().stream()
                .anyMatch(x -> x == 7);
        System.out.println(res);

        System.out.println("////INTEGER Filter///");
        List<Integer> res1 = getListOfIntegers().stream()
                .filter(x->x % 2 == 0)
                .map(x->x*2)
                .collect(Collectors.toList());

        res1.forEach(System.out::println);

        System.out.println("////INTEGER Filter every 3-rd element///");
        System.out.println("Initial List");
        getListOfIntegers().forEach(System.out::print);
        System.out.println();
        System.out.println("after filter");
        List<Integer> res2 = IntStream.range(0, getListOfIntegers().size())
                .filter(n->n % 3 == 0)  //3 - каждый 3-ий элемент
                .mapToObj(getListOfIntegers()::get)
                .collect(Collectors.toList());
        res2.forEach(System.out::print);

    }
    private static Car getMin(){
        Car min = getListOfCars().stream()
                .min(Comparator.comparing(Car::getModel).thenComparing(Car::getColor))
                .get();
        return min;
    }

    private static List<Car> getListOfCars(){
        return List.of(
                new Car("Acura", "Red", Classification.BUS),
                new Car("Acura", "Green", Classification.BUS),
                new Car("Ford", "Yellow", Classification.TRACK),
                new Car("Mercedes", "Black", Classification.SPECIALCAR),
                new Car("Iveco", "White", Classification.TRACK),
                new Car("Iveco", "Black", Classification.BUS),
                new Car("Ford", "White", Classification.SPECIALCAR),
                new Car("Tesla", "Black", Classification.SPECIALCAR),
                new Car("Tesla", "Black", Classification.TRACK)
        );
    }

    private static List<Integer> getListOfIntegers(){
        List<Integer> listOfIntegers= List.of(
                2,3,4,5,6,7,8,9
        );
        return listOfIntegers;
    }
}
