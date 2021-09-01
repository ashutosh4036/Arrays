import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class Max {
    public static void main(String[] args) {
      /*  int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();


        }
        s.close();
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }*/
      ArrayList numbers= new ArrayList();
       numbers.add(9);
       numbers.add(89);
        System.out.print(numbers);
    }

    // work on edge cases here, like array being null
    /*static int maxRange(int[] arr, int start, int end) {

        if (end < start) {
            return -1;
        }

        if (arr == null) {
            return -1;
        }

        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }*/
}
