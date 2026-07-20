import java.util.Arrays;

public class day19_1 {
    public static void main(String[] args) {
        int[] nums={1,4,3,2};
        Arrays.sort(nums);
        int i=0,j=1,maxx=Integer.MIN_VALUE,minn=Integer.MAX_VALUE;
        int sum=0;
        while(i<nums.length && j< nums.length){
            minn=Math.min(nums[i],nums[j]);
            sum+=minn;
            i+=2;
            j+=2;
        }
        System.out.println(sum);
    }
}
