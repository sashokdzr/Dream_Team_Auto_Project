package Codewars;

class binarysearch {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }


    public static int getNumber() {
        int counter =0;
        int end=999;
        int start=1;
        int i=(end+start)/2;
        //while (!guess(i).equals("Correct!")){
        while (end>start){
           // counter++;
            if (guess(i).equals("Too high!")){
                counter++;
                end = i;
            }
            else {
                start = i+1;
            }
            i=(end+start)/2;
        }
        System.out.println(counter);
        return i;
    }

    public static String guess(int n){
        int number = 244;
        if (n==number){
            return "Correct!";
        }
        else if (n<number){
            return "Too low!";
        }
        else{
            return "Too high!";
        }
    }
}
