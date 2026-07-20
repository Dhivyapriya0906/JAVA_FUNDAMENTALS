import java.util.Arrays;

public class day19_3 {
    public static void main(String[] args) {
        int[] nums={1,2,1,10};
        Arrays.sort(nums);
        for (int i= nums.length-1;i>=2;i--){
            if(i!=0) {
                if (nums[i] < (nums[i - 1] + nums[i - 2])) {
                    System.out.println(nums[i] + nums[i - 1] + nums[i - 2]);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
