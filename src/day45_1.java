public class day45_1 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int prod=1;
        int[]  ans=new int[nums.length];
        ans[0]=nums[0];
     for(int i=1;i< nums.length;i++){
         ans[i]=ans[i-1]*nums[i-1];

     }


        for(int i = nums.length - 1; i >= 0; i--){
            ans[i] = ans[i] * prod;
            prod = prod * nums[i];
        }

        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}
