/*XO("ooxx") => true
        XO("xooxx") => false
        XO("ooxXm") => true
        XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
        XO("zzoo") => false*/

package Codewars;

class oxoxo {
    public static boolean getXO (String str) {
        str = str.toLowerCase();
        String str1=str.replaceAll("[^x]","");
        String str2=str.replaceAll("[^o]","");

        return str1.length()==str2.length();

    }

}
