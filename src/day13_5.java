public class day13_5 {
    public static void main(String[] args) {
        int[] nums={2,4,5,3,4};
        int target=7;

        for(int i=0;i< nums.length-1;i++){
            for(int m=i+1;m<nums.length-1;m++){
                if(nums[i]+nums[m]==target){
                    //return new int[]{i,m};
                    System.out.println(i+" "+m);
                    break;
                }

            }
        }
    }
}
