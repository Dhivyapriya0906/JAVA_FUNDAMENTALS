public class day45_2 {
    public static void main(String[] args) {
                //  i j
        int[] nums={4,5,0,-2,-3,1};
        //          4 9 9 7 4 5
        int k=5;
        int[] prefixsum=new int[nums.length];
        prefixsum[0]=nums[0];
        for(int i=1;i< nums.length;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        for(int e: prefixsum){
            System.out.print(e+" ");
        }
    }
}
