import java.util.HashMap;
import java.util.Map;

class hasnMap {
    public static void main(String[] args) {
        HashMap<String, Integer> months = new HashMap<String, Integer>();
        Map<Integer, String> list= new HashMap<>();
        list.put(1, "red");

        months.put("January", 31);
        months.put("Fabruary", 30);
        months.put("March", 28);


       for (String i : months.keySet()) {
            if (i.equals("March")) {
                System.out.println(months.get(i));
            }

            System.out.println();
        }
        for (Integer v : months.values()) {
            if (v == 30) {
                System.out.println(months.get(v));
            }
        }
    }
}
