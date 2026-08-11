import java.util.Arrays;
import java.util.HashSet;

public class day37_2 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,5};
        int tot=nums[0];
        for(int i=1;i< nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                tot+=nums[i];
            }
            else{
                break;
            }
        }
        System.out.println(tot);
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        while( set.contains(tot)){
            tot++;
        }
        System.out.println(tot);
    }
}
