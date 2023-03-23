import java.util.Arrays;
import java.util.List;

class ListTask {
    //['simple', 'is', 'better', 'than', 'complex'] ==> 7
    public static void main(String[] args) {
        List <String> list = Arrays.asList("April", "November", "January");
        System.out.println(findfLength(list));

    }

    public static int findfLength (List <String> list){

        int max = 0;
        for (int i=0; i< list.size(); i++){
            if (list.get(i).length()>max){
                max = list.get(i).length();
            }
        }
        return max;
    }
}
