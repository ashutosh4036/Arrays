public class NextPermutation {

    public static void nextPermutation(int[] nums) {
            if(nums.length==1) return;

            int flag = -1;
            int pivot = -1;

            for(int i=nums.length-1; i>0; i--){
                if(nums[i]-nums[i-1] > 0){
                    flag=1;
                    pivot=i-1;
                    break;
                }
            }

            if(flag==-1){
                reverse(nums, 0, nums.length-1);
                return;
            }

            for(int i=nums.length-1; i>pivot; i--){
                if(nums[i]>nums[pivot]){
                    swap(nums, i, pivot);
                    reverse(nums, pivot+1, nums.length-1);
                    return;
                }
            }

        }


        public static void reverse(int[] nums, int i, int j){
            while(i<j){
                swap(nums, i, j);
                i++;
                j--;
            }
            return;
        }
        public static void swap(int[] nums, int i, int j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            return;
        }

    public static void main(String[] args) {
        int[] arr= {1,2,3};
        nextPermutation(arr);
        for (int ele: arr
        ) {
            System.out.println(ele);
        }
    }
    }



