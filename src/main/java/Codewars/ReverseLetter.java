package Codewars;

//Task
//        Given a string str, reverse it and omit all non-alphabetic characters. (65-90, 97-122)
//
//        Example
//        For str = "krishan", the output should be "nahsirk".
//
//        For str = "ultr53o?n", the output should be "nortlu".

class ReverseLetter {
    public static void main(String[] args) {
        System.out.println(reverseLetter("ultr53o?n"));
    }
    public static String reverseLetter(final String str) {


        String str2 = str.chars().toString();
//                .filter(ch -> ch >= 'a')
//                .filter(ch -> ch <= 'z').toString();

        return str2;

    }
}
