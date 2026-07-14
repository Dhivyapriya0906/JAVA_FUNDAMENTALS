public class day13_4 {
    public static void main(String[] args) {
        int[] nums = {2,1,3,4};
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%nums.length])
            {
                c+=1;
            }
        }
        System.out.println(c>1?false:true);
    }
}
