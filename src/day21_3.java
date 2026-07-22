public class day21_3 {
    public static void main(String[] args) {
        int[] nums={3,1,4,2};
        int con=0;
        int i=0;
        while(i<nums.length){
            if(con%2==0){
                if(nums[i]%2==0){
                    int tem=nums[i];
                    nums[i]=nums[con];
                    nums[con]=tem;
                    con+=2;
                }
            }
            else{
                if(nums[i]%2!=0){
                    int tem=nums[i];
                    nums[i]=nums[con];
                    nums[con]=tem;
                    con+=2;
                }
            }
            i++;
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
