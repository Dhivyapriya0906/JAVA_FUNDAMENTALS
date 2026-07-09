import java.util.Scanner;

public class day61 {
    public static void main(String[] args) {
       int arr[]={5,2,4,1,3,6,0};
       Solution s= new Solution();
        System.out.println(s.thirdMax(arr));
    }
}
class Solution {
    public int thirdMax(int[] nums) {
        long max=Long.MIN_VALUE;
        long smax=Long.MIN_VALUE;
        long tmax=Long.MIN_VALUE;
        for (int num:nums){
            if(num>max){
                tmax=smax;
                smax=max;
                max=num;
            }
            else if(num>smax){
                if(num==max){
                    continue;
                }
                tmax=smax;
                smax=num;
            }
            else if(tmax<num){
                if(smax==num){
                    continue;
                }
                tmax=num;
            }
        }
        if(tmax==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)tmax;
    }
}
//class Solution {
//    public int thirdMax(int[] nums) {
//        long max=Long.MIN_VALUE;
//        long smax=Long.MIN_VALUE;
//        long tmax=Long.MIN_VALUE;
//        for (int i=0;i<nums.length;i++){
//            if( (nums[i] == max || nums[i] == smax) || nums[i] == tmax)
//                continue;
//           else if(nums[i]>max){
//                tmax=smax;
//                smax=max;
//
//                max=nums[i];
//
//
//            }
//            else if((max>smax && smax<nums[i]) && (max!=nums[i]) && nums[i]!=smax){
//                tmax=smax;
//                smax=nums[i];
//
//            }
//            else if (((smax!=nums[i]) && (smax>tmax && tmax<nums[i])) && (nums[i]!=smax)) {
//                tmax=nums[i];
//            }
//            System.out.println("Max:"+max);
//            System.out.println("Sec Max:"+smax);
//            System.out.println("Third Max:"+tmax);
//        }
//        if(tmax==Long.MIN_VALUE){
//            return (int)max;
//        }
//        return (int)tmax;
//    }
//}
