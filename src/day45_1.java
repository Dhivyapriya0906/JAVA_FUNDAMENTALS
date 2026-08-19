public class day45_1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int prod=1;
        int[]  ans=new int[nums.length];
        int i=0;
        for(int e=0;e<nums.length;e++){
           ans[e]=prod;
           prod*=nums[e];
        }
        prod=1;
        for(int j= nums.length-1;j>-1;j--){
               ans[j]*=prod;
               prod*=nums[j];
        }
        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}
