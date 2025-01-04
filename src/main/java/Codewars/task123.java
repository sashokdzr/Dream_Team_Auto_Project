package Codewars;

//Написать функцию, которая будет возвращать true,
//если поданный на ввод массив int содержит 3 и более
//последовательных числа в любом месте
public class task123 {
    public static void main(String[] args) {
        System.out.println(three(new int[] {2,4,6,7,8,9,10,1,5}));
        System.out.println(three(new int[] {2,4,6,1,8,6,0,1,2}));
        System.out.println(three(new int[] {2,4,6,1,8,6,0,9,2}));
    }
    public static boolean three (int[] input){
        for (int i=0; i<input.length-2; i++){
            if ((input[i+2]- input[i+1]==1) && (input[i+1] - input[i] == 1)){
                return true;
            }
        }
        return false;
    }
}
