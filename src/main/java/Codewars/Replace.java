package Codewars;

class Replace {
    public static void main(String[] args) {
        String string ="1,5,0,S,o,I";
        System.out.println(correct(string));
    }

        public static String correct(String string) {
        String MyString = "";
            String newString1 = "";
            MyString = string.replace('5', 'S').replace('0', 'o').replace('1', 'I');
            newString1 = string.replaceAll("o,I", "HI");
            return newString1;
        }



}
