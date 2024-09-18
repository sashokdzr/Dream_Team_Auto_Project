package Codewars;
public class PrincipalSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] mass = new int[][]{
                {2,2,2},
                {4,2,6},
                {8,8,2}};
        System.out.println(diagonal(mass));
    }
    public static String diagonal(int[][] matrix){
        int principal = 0;
        int secondary = 0;
        for (int i=0; i<matrix[0].length; i++){
            principal+= matrix[i][i];
            int a = matrix[0].length - 1 - i;
            secondary+= matrix[i][a];

        }
        return principal>secondary?"Principal Diagonal win!":(principal<secondary?"Secondary Diagonal win!":"Draw!");
    }
}
