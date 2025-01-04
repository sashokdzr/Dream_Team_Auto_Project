package Codewars;

class StringEndsWith {
    public static void main(String[] args) {
        System.out.println(solution("this", ""));
    }

    public static boolean solution(String str, String ending) {
        char[] newSrt = str.toCharArray();
        char[] newEnding = ending.toCharArray();
        if (newEnding.length == 0){
            return true;
        }
        if (str.contains(ending) && newSrt[newSrt.length - 1] == newEnding[newEnding.length - 1]) {
            return true;
        } else {
            return false;
        }
    }
}
