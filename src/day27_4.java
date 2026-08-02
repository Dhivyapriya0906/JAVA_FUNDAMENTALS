public class day27_4 {
    public static void main(String[] args) {
        int[] nums={2,3,1,2};
        boolean check=false;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                count++;
            }
            if(count>1){
                System.out.println(false);
                return;
            }
            if(i>0 && nums[i-1]>=nums[i+1]){
                nums[i+1]=nums[i];
            }

        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
