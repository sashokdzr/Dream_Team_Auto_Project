import java.util.*;
import java.util.stream.Stream;


public class Test3 {

    public static void main(String[] args) {
        Map<Character, Integer> mapper = new HashMap<>();
        mapper.put('a', 1);
        mapper.put('b', 2);

        System.out.println(mapper.get('b'));

        for (Character key:mapper.keySet()){
            System.out.println(key);
        }

        mapper.forEach((key, value) -> System.out.println((key)));

        int[] arr = new int[]{1,8,3,4,5,7,0};
        List<Integer> arrList = new ArrayList<>();
        arrList = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList();
        System.out.println(arrList);
        Integer[] arr2 = arrList.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));

        String[] arr1 = new String[]{"123", "456", "789"};
        List<String> strList = Arrays.stream(arr1).toList();

        List<String> stringList = List.of("How", "are", "you", "?");
        System.out.println(counter(stringList));
        String str = "Howareyou123";
        List<String> strList1 = Arrays.stream(str.split(" ")).filter(e->e.contains("o")).toList();
        System.out.println(strList1);

        System.out.println(str.chars().allMatch(c->{
            boolean isLetter = Character.isLetter(c);
            boolean isDigit = Character.isDigit(c);
            return isLetter || isDigit;
        }));

        List<Integer> intList = List.of(1,4,7,9,4,5,7);
        System.out.println(intList.stream().reduce((a,b) -> a>b ? a : b).get());
        System.out.println(intList.stream().reduce((a,b) -> a + b).get());
        int[] array1 = {1,5,8,5,8,0,7};
        int[] array2 = {};
        System.out.println(Arrays.stream(array1).reduce((a , b) -> Math.max(a, b)).orElse(0));
        System.out.println(Arrays.stream(array2).reduce((a , b) -> Math.max(a, b)).orElse(0));
        Integer t = 12;
        int c = t;
        System.out.println(c);

        List<String> strTest = List.of("This", "is", "list", "of", "strings");
        System.out.println(findLongest(strTest));
        List<String> strTest1 = List.of();
        System.out.println(findLongest(strTest1));

        String sttr = "jhkjhtrkghkrh";
        sttr.chars().allMatch(p -> Character.isLetter(p));

        Integer m = 12;
        int z = 12;
        System.out.println(z == m);

        char ch = 'z';
        System.out.println((int)ch);
        System.out.println((char)188);
        for (int i=0; i<200; i++){
            System.out.print((char) i + " ");
            System.out.println();
        }

        Map<Integer, Character> ascii = new HashMap<Integer, Character>();
        for (int i=0; i<200; i++){
            ascii.put(i, (char)i);
        }
        System.out.println(ascii.toString());

    }

    static List<String> counter(List<String> incoming){
        return incoming.stream().filter(e-> e.contains("o")).toList();
    }

    static String findLongest(List<String> str) {
        return str.stream().reduce((a, b) -> a.length() > b.length() ? a : b).orElse("String list is empty");
    }

}
