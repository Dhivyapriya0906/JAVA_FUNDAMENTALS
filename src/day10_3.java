import java.util.Arrays;

public class day10_3 {
    public static void main(String[] args) {
        int[] nums={555,901,482,1771};
        String n[]=new  String[nums.length];
        int count=0;
        for(int i=0;i< nums.length;i++){
                n[i]=Integer.toString(nums[i]);
        }
        for(int i=0;i<n.length;i++){
            int c;
            c=n[i].length();

            if(c%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
