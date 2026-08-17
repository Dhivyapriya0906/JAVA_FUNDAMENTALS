public class day44_3 {
    public static void main(String[] args) {
        int[] nums={2,3,1,2,4,3};
        int target=7;
        int i=0;
        int sum=0;
        int minLen=Integer.MAX_VALUE;
        for(int j=0;j< nums.length;j++){
            sum=sum+nums[j];
            if(sum>=target){

                while(sum>=target){

                    int Len=j-i+1;
                    minLen=Math.min(Len,minLen);
                    sum=sum-nums[i];
                    i++;
                }
            }
        }
        System.out.println(minLen);
    }
}
