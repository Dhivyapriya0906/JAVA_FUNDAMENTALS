public class day19_2 {
    public static void main(String[] args) {
        int[] nums={-100,-98,-1,2,3,4};
        int minn=Integer.MAX_VALUE;
        int sminn=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int secc=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>maxx){
                third=secc;
                secc=maxx;
                maxx=nums[i];
            }
            else if(nums[i]>secc && secc!=maxx){
                third=secc;
                secc=nums[i];
            }
            else if(nums[i]>third && third!=secc){
                third=nums[i];
            }
            if(nums[i]<minn){
                sminn=minn;
                minn=nums[i];
            } else if(sminn!=minn && sminn>nums[i]  ) {
                sminn=nums[i];
            }
        }
        System.out.println(maxx+" "+secc+" "+third);
        System.out.println(minn+ " "+sminn);
        int prod1=secc*maxx*third;
        int prod2=minn*sminn*maxx;
        System.out.println(prod1+" "+prod2);
        if(prod1>=prod2) {
            System.out.println(prod1);
        }
        else{
            System.out.println(prod2);
        }
    }
}
