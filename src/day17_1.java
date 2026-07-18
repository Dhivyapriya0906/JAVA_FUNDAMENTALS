public class day17_1 {
    public static void main(String[] args) {
        int[] nums={2,5,6,9,10};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println(max+" "+min);
        int res=GCD(min,max);
        System.out.println(res);
    }
    static int GCD(int a,int b){
        int gcd=0;
        while(b!=0){
             gcd=a%b;
            a=b;
            b=gcd;

        }
    return a;
    }

}
