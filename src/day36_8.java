import java.util.ArrayList;

public class day36_8 {
    public static void main(String[] args) {
        int[] nums={10,2,5,10,9,1,1,4,3,7};
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i=0;i< nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                ans.add(Math.abs(nums[i]));

            }
            else {
                nums[index] = -nums[index];
            }
        }
        System.out.println(ans);
    }
}
