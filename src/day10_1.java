import java.util.Scanner;

public class day10_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] nums=new int[]{1,2,1};
        int n= nums.length;
        int ans[]=new int[2* nums.length];
        for(int i=0;i< ans.length;i++){
            if(i<n){
                ans[i]=nums[i];
            }
            else{
                ans[i]=nums[i-n];
            }
        }
        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}
