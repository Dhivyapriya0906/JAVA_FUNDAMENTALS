public class day21_4 {
    public static void main(String[] args) {
        int[] nums={5,5,3};
       boolean ascCheck=false;
       boolean desCheck=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                ascCheck=true;
            } else if (nums[i]>nums[i+1]) {
                desCheck=true;
            } else{
                continue;
            }
        }
        if(ascCheck && desCheck ){
            System.out.println(false);
            return;
        }
        System.out.println(true);

    }
}
