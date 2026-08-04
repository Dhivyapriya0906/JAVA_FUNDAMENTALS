import java.util.ArrayList;
import java.util.Arrays;

public class day30_1 {
    public static void main(String[] args) {
        int[] nums={1,4,5,2};
        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
        //      1 2  4 5
        for(int i=0;i< nums.length-1;i++){
            if((nums[i+1]-nums[i]>1) ){
                for(int j=nums[i]+1;j<nums[i+1];j++){
                    ans.add(j);
                }

            }

        }
        System.out.println(ans);
    }
}
