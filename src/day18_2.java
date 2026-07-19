public class day18_2 {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3};
        int i=0;
        for(int j=1;j< nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                nums[j]=0;
            }
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
