public class day32_2 {
    public static void main(String[] args) {
        int[] nums={5,7,7,5};
        int target=5;
        int start=1;
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
              int min= Math.abs(i-start);
                if(minn>min){
                    minn=min;
                }
            }
        }
        System.out.println(minn);
    }
}
