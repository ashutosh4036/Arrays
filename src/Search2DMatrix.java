public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0;
        if (matrix.length == 0) return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int hi = (n * m) - 1;

        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);
            if (matrix[mid / m][mid % m] == target) {
                return true;
            }
            if (matrix[mid / m][mid % m] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int x=3;
        System.out.println( searchMatrix(arr,x));
    }
}


/*class GFG {

    private static void search(int[][] mat,
                               int n, int x)
    {

        int i = 0, j = n - 1;

        while (i < n && j >= 0)
        {
            if (mat[i][j] == x)
            {
                System.out.print("n Found at " +
                        i + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else // if mat[i][j] < x
                i++;
        }

        System.out.print("n Element not found");
        return;
    }
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 29);
    }
}*/
