public class MajorityElement {
    public static int majorityElement(int[]nums){
        int count=0;
        int candidate=0;

        for (int num:nums
             ) {
            if(count==0){
                candidate=num;
            }
            if(num==candidate) count+=1;
            else count-=1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int []arr={6,6,6,7,7};
        System.out.println(majorityElement(arr));
    }

}
