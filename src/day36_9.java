public class day36_9 {
    public static void main(String[] args) {
        int[] nums={10,1,2,4,7,2};
        int limit=5;
        int maxlength=0;
        int left=0;
        int right=0;
        while(left<nums.length){
            int diff=Math.abs(nums[left]-nums[right]);
            if(diff<=limit){
                right++;
            }
            else{
                left++;
                right=left;
            }
            int ws=right-left+1;
            maxlength=Math.max(ws,maxlength);
        }
        System.out.println(maxlength);
    }
}
