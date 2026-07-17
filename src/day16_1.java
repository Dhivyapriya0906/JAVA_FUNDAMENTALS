public class day16_1 {
    public static void main(String[] args) {
        int[] nums={1};
//        int[] left=new int[nums.length];
//        int[] right=new int[nums.length];
//       int l_sum=0;
//       int n= nums.length-1;
//       int r_sum=0;
//        for(int i=0;i< nums.length;i++){
//            left[i]=l_sum;
//            right[n-i]=r_sum;
//            l_sum+=nums[i];
//            r_sum+=nums[n-i];
//        }
//        int[] diff=new int[n+1];
//        int i=0,j=n;

//        for (int i=0;i<=n;i++){
//            diff[i]=Math.abs(left[i]-right[i]);
//            System.out.print(diff[i]+" ");
//        }
        int l_sum=0;
        int n= nums.length-1;

        int[] diff=new int[n+1];
        //int i=0,j=n;
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=nums[i];

        }
        int r_sum=sum;
        int i=0,j=1;
        while(i!=n+1 ){
            diff[i]=Math.abs(l_sum-r_sum);
            if(i<n+1 && j<n+1) {
                l_sum += nums[i];
                r_sum -= nums[j];
            }
            System.out.print(diff[i]+" ");
            i++;
            j++;

        }
    }
}
