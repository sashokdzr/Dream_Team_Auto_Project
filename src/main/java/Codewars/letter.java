package Codewars;

//      assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
//            assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));

class letter {
    public static char findMissingLetter(char[] array) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int tempIndex = -1;
        int i= 0;
        while (i < array.length - 1) {
            int index1 = alphabet.indexOf(array[i]);
            int index2 = alphabet.indexOf(array[i + 1]);
            if (Math.abs(index1 - index2) != 1) {
                tempIndex = index1;
                break;
            } else i++;
        }
        return alphabet.charAt(tempIndex+1);

    }

    public static void main(String[] args) {
        char[] arr = { 'a','b','c','d','f' };
        char[] arr1 = { 'O','Q','R','S' };
        System.out.println(findMissingLetter(arr));
        System.out.println(findMissingLetter(arr1));
    }
}
