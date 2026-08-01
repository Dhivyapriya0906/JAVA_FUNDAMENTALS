public class day27_2 {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        int count=0;
        for(int i=1;i< nums.length;i++){
            if((nums[i]<=nums[i-1])){

                int end=nums[i-1]+1;
                count+=end-nums[i];
                nums[i]=end;
            }

        }
        System.out.println(count);
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
