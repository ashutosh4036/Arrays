import org.jetbrains.annotations.NotNull;

/*import java.util.ArrayList;
import java.util.Scanner;

public class MulArr {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();

            // initialisation
            for (int i = 0; i < 3; i++) {
                list.add(new ArrayList<>());
            }

            // add elements
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    list.get(i).add(in.nextInt());
                }
            }

            System.out.println(list);
        }

}*/
class Mul {
    /*public static int findDuplicate(int @NotNull [] nums) {
        int slow= nums[0];
        int fast =nums[0];
        do{
            slow=nums[slow];
            fast = nums[nums[fast]];

        }while(slow!=fast);

        fast =nums[0];
        while(slow!=fast){
            slow =nums[slow];
            fast =nums[fast];
        }
        System.out.println(slow);
        return slow;
    }*/
    public static int findDuplicate(int[] nums) {

        // Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];

        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        System.out.println(hare);
        return hare;
    }
    public static void main(String[] args) {
        int[]arr = {1,3,5,2,3};
        findDuplicate(arr);

    }
}