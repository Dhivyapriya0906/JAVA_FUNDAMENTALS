public class day36_7 {
    public static void main(String[] args) {
        int[] nums={5, 1, 6, 4, 3,2};
        int small=Integer.MAX_VALUE;
        int med=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=small){
                small=nums[i];
            }
            else if(nums[i]<=med){
                med=nums[i];
            }
            else{
                System.out.println(true);
                return;
            }

        }
        System.out.println(false);


    }
}
