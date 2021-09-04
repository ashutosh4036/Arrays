import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;

public class SetMatrixZeros {
    public static void setZeroes(int[][] matrix) {
        int col0 = 1, rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
            }
            for (int i = rows - 1; i >= 0; i--) {
                for (int j = cols - 1; j >= 1; j--) {
                    if (matrix[i][0] == 0 || matrix[0][j] == 0)
                        matrix[i][j] = 0;
                    if (col0 == 0) matrix[i][0] = 0;
                }
            }

        }
    public static void main(String[] args) {
        int [][]arr= {{1,1,1},{0,0,1},{1,1,1}};
        setZeroes(arr);
        for (int[] row : arr
             ) {
            for (int ele : row
                 ) {
                System.out.print(ele + " ");
            }
            System.out.println();

        }
    }
}




