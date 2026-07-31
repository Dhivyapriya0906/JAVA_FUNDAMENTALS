import java.util.ArrayList;

public class day26_2 {
    public static void main(String[] args) {
        int[] num={1,2,0,0};

        int k=34;
        int sum=0;
        for(int i=0;i< num.length;i++){
            sum=sum*10+num[i];
            System.out.print(sum+ " ");
        }
        sum+=k;
        System.out.println(sum);

        int t=sum;
        int count=0;

        while(t>0){
            count++;
            t/=10;
        }
        System.out.println(count);
        int[] ans=new int[count];
        for(int i=count-1;i>=0;i--){
                int rem=sum%10;
                ans[i]=rem;
                sum/=10;

        }
        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}
