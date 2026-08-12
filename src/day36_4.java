public class day36_4 {
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};
        int read=2;
        int write=2;
        while(read< nums.length && write<nums.length){
            if(nums[read]!=nums[write-2]){
                    nums[write]=nums[read];
                    write++;

            }
            read++;
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
