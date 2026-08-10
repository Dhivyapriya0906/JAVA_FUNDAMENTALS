import java.util.ArrayList;
import java.util.Arrays;

public class day35_5 {
    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        Arrays.sort(nums);
        int target=2;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]==target){
                ans.add(i);
            }
        }

    }
}
