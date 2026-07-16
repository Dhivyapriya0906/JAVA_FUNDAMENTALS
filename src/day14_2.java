import java.util.ArrayList;

public class day14_2 {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        Integer[] ans=new Integer[nums.length];
        for (int i=0;i< nums.length;i++){
            int ind=index[i];
            if(ans[ind] ==null){
                ans[ind]=nums[i];
            }
            else{
                int pos=ind;
                for (int j= nums.length-1;j>pos;j--){
                    ans[j]=ans[j-1];
                }
                ans[ind]=nums[i];
            }
        }
        for(Integer e:ans) {
            System.out.print(e+" ");
        }
    }
}
