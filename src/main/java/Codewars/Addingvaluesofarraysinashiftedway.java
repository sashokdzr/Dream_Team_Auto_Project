package Codewars;

class Addingvaluesofarraysinashiftedway {
    public static void main(String[] args) {
        int[][] arrayOfArrays = {{1,1,1,1,1},{2,2,2,2,2}};
        System.out.println(addingShifted(arrayOfArrays, 2));
    }
    public static int[] addingShifted(int[][] arrayOfArrays, int shift)
    {   int rows = arrayOfArrays.length;
        int arrlength = arrayOfArrays[0].length;
        int[] newArray = new int[arrlength + (rows-1)*shift];
        for (int k=0; k<newArray.length; k+=shift) {
            for (int j = 0; j < rows; j++) {
                for (int i = 0; i < arrlength; i++) {
                    newArray[k] += arrayOfArrays[j][i];
                    k++;
                }
            }
        }
        return newArray;
    }
}