import java.util.ArrayList;
import java.util.HashSet;

public class day26_4 {
    public static void main(String[] args) {
        int[] nums1={1,2,1,2};
        int[]  nums2={1,2,4,5};
        HashSet<Integer> ans1 =new HashSet<>();
        HashSet<Integer> ans2 =new HashSet<>();
        for (int i=0;i< nums1.length;i++){
            ans1.add(nums1[i]);
        }
        for(int e:nums2){
            ans2.add(e);
        }
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        for(int e:ans1){
            if(!ans2.contains(e)){
                list1.add(e);
            }
        }
        for(int e:ans2){
            if(!ans1.contains(e)){
                list2.add(e);
            }
        }
        System.out.println(list1+""+list2);
    }
}
