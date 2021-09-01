public class Maximumsubarray {
    public static int maxSubArray(int[] nums){
        int sum=0;
        int maxi=nums[0];
        for (int num : nums) {
            sum += num;
            if (sum > maxi) maxi = sum;
            if (sum < 0) sum = 0;
        }
        System.out.println(maxi);
        return maxi;
    }

    public static void main(String[] args) {
        int[]arr={-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(arr);

    }
}
