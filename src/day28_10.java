import java.util.HashMap;

public class day28_10 {
    public static void main(String[] args) {
        int count1=0;
        int count2=0;
        boolean[] ans1=new boolean[101];
        boolean[] ans2=new boolean[101];
        int[] nums1={2,2,1};
        int[] nums2={1,3};
        for(int v:nums1){
            ans1[v]=true;

        }
        for(int v:nums2){
            ans2[v]=true;

        }
        for(int i=0;i< nums1.length;i++){
            if(ans2[nums1[i]]){
                count1++;
            }
        }
        for(int i=0;i< nums2.length;i++){
            if(ans1[nums2[i]]){
                count2++;
            }
        }
        System.out.println("["+count1+" , "+count2+" ]");
    }
}
