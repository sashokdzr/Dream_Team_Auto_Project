package Codewars;
//966 969 972 975 978
class Sticks {
    public static void main(String[] args) {
        System.out.println(solution(963, 978));
    }
    public static int solution(int start, int finish){
        int counter = 0;
        while (start<=finish-3){
            start+=3;
            counter++;
        }
        while (start < finish){
            start++;
            counter++;
        }
        return counter;
    }
}
