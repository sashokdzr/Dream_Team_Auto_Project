import java.util.*;
class Lists {
    public static void main(String[] args) {
        System.out.println(testArrayList());
        System.out.println(generateLinkedList(5));
        System.out.println(generateLinkedList(12));
    }
    public static List testArrayList(){
        List <Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(234);
        arrayList.add(345);
        arrayList.add(567);
        return arrayList;
    }
    public static List generateLinkedList(int length){
        List <Double> linkedList = new LinkedList<Double>();
        for (int i =0; i<length; i++) {
            Double k = Math.ceil(Math.random()*1000);
            linkedList.add(k/100);
        }

        return linkedList;

    }
}
