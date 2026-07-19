import java.util.Arrays;

public class day17_3 {
    public static void main(String[] args) {
        int[] nums1 = {4,6,5,0,0,0};
        int[] nums2 = {1,2,3};
        int m = 3;
        int n = 3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        System.out.println();
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}                                   // 0,1,2,3,4,5              0,1,2
//i=3-1=2     j=2     k=5     nums1 = {1,2,4,0,0,0};   nums2 = {2,3,6};
//while(2>=0 and 2>=0)    T
//                        4>6   F           else        nums[5]=6       j=1         k=4{1,2,4,0,0,6}
//(2>=0 and 1>=0)         T
//                        4>3   T
//                              nums[4]=4       i=1     k=3                             {1,2,4,0,4,6}
//(1>=0 and 1>=0)         T
//                        2>3   F           else        nums[3]=3       j=0     k=2     {1,2,4,3,4,6}
//(1>=0 and 0>=0)         T
//                         2>2  F           else        nums[2]=2       j=-1    k=1     {1,2,2,3,4,6}
//(1>=0 and -1>=0)         F
//while(-1>=0)      F
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
