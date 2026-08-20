import java.util.ArrayList;

public class day45_3 {
    public static void main(String[] args) {
        int nums[]={1,2,3,3};
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i] );
            }
        }
        arr1.addAll(arr2);

    }
}
