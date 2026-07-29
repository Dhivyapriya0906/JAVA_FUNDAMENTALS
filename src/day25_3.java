import java.util.ArrayList;
import java.util.Arrays;

public class day25_3 {
    public static void main(String[] args) {
        int[] nums={-3,3,3,90};
        int count=0;
        int max=nums[0];
        int min=nums[0];
        Arrays.sort(nums);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i< nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
            if(min>nums[i]){
                min=nums[i];
            }
        }
        for(int e:nums){
            if(e!=max && e!=min){
                if((e>min && e<max)){
                    ans.add(e);
                    count++;
                }
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
    }
}
