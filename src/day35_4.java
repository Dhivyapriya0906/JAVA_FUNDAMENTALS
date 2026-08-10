import java.util.HashMap;
import java.util.Map;

public class day35_4 {
    public static void main(String[] args) {
        int[][]nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        //  3 1 2 4 5
        //  1 2 3 4
        //  3 4 5 6
        HashMap<Integer,Integer> mpp =new HashMap<>();
        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                mpp.put(nums[row][col],mpp.getOrDefault(nums[row][col],0)+1);
            }
        }
        int count=nums.length;
        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            if(entry.getValue()==count){
                System.out.println(entry.getKey());
            }
        }
    }
}
