import java.util.Scanner;

public class day10_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] nums={2,5,1,3,4,7,8,5};
        int n= scan.nextInt();
        int[] ans= new int[2*n];
        int st1=0;
        int st2=n;
        int i=0;
        while(i< ans.length){
            if(i%2==0){
                ans[i]=nums[st1];
                st1++;
            }
            else{
                ans[i]=nums[st2];
                st2++;
            }
            i++;
        }
        for(int e: ans){
            System.out.print(e+" ");
        }
    }
}
