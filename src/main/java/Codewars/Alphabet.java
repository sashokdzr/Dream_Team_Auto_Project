package Codewars;
//97-a
//122-z
class Alphabet {
    public static String moveTen(String s) {
        String result="";
        for (int i=0; i< s.length(); i++){
            if (s.charAt(i)<113){
                result += Character.toString(s.charAt(i) + 10);
            } else {
                result += Character.toString(s.charAt(i)-16);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(moveTen("xyz"));
    }
}
