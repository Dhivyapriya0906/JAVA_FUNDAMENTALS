import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
       int arr[]={2,1,2,3};
       Solution s= new Solution();
        System.out.println(s.thirdMax(arr));
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for (int i=0;i<nums.length;i++){

           if(nums[i]>max){
                tmax=smax;
                smax=max;

                max=nums[i];


            }
            else if(max>smax && smax<nums[i]){
                tmax=smax;
                smax=nums[i];

            }
            else if ((smax!=nums[i]) && (smax>tmax && tmax<nums[i])) {
                tmax=nums[i];
            }
            System.out.println("Max:"+max);
            System.out.println("Sec Max:"+smax);
            System.out.println("Third Max:"+tmax);
        }
        if(tmax==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)tmax;
    }
}