import java.util.Arrays;
import java.util.Scanner;

public class MulDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        Scanner in = new Scanner(System.in);
        int[][] arr;

        arr = new int[][]{
                {1, 2, 3},
                {4, 5}, // 1st index
                {6, 7, 8, 9}
        };

        arr = new int[3][3];
        System.out.println(arr.length); // no of rows
        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }


        for (int[] ints : arr) {

            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        // output
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
