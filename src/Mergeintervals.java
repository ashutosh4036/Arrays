import java.util.*;

public class Mergeintervals {


//    public static  int[][] merge(int[][] intervals) {
//        List<int[]> res = new ArrayList<>();
//
//        if(intervals.length == 0 || intervals == null)
//            return res.toArray(new int[0][]);
//
//        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//
//        int start = intervals[0][0];
//        int end = intervals[0][1];
//
//        for(int[] i : intervals) {
//            if(i[0] <= end) {
//                end = Math.max(end, i[1]);
//            }
//            else {
//                res.add(new int[]{start, end});
//                start = i[0];
//                end = i[1];
//            }
//        }
//        res.add(new int[]{start, end});
//        return res.toArray(new int[0][]);
//    }
public static int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    LinkedList<int[]> merged = new LinkedList<>();
    for (int[] interval : intervals) {
        // if the list of merged intervals is empty or if the current
        // interval does not overlap with the previous, simply append it.
        if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
            merged.add(interval);
        }
        // otherwise, there is overlap, so we merge the current and previous
        // intervals.
        else {
            merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
        }
    }
    return merged.toArray(new int[merged.size()][]);
}
    public static void main(String[] args) {
        int [][] arr =  { {1,3},{2,6},{8,10},{15,18}};
//        int a = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                arr[i][j]= a;
//                System.out.print(arr[i][j] + " ");
//                a++;
//            }
//            System.out.println();
//        }
        int [][] ans ;
        ans = merge(arr);
//
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j <ans[i].length ; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }


}


