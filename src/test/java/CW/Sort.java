package CW;

import java.util.Arrays;


//  lst contains integers, that means it may contain some negative numbers
//if lst is empty or contains a single element, return 0
// lst is not sorted
class Sort {
    int[] lst = {2,3,-6,-8,4,1};
    public static int maxDiff(int[] lst) {
        if (lst.length<2){
            return 0;
        }
        else {
            Arrays.sort(lst);
            return(lst[lst.length-1]-lst[0]);
        }
        }
}
