import java.util.ArrayList;
import java.util.Arrays;

public class day35_3 {
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        ArrayList<String > ans=new ArrayList<>();
        int read=nums[0];
        int write=nums[0];
        for (int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]==1){
              //  continue;
                write=nums[i];
            }
            else{
                if(read==write){
                    ans.add(""+read);
                }
                else {
                    ans.add(read + "->" + write);

                }
                read = nums[i];
                write = nums[i];
            }

        }
        if(read==write){
            ans.add(""+read);
        }
        else{
            ans.add(read+"->"+write);
        }

        System.out.println(ans);
    }
}
