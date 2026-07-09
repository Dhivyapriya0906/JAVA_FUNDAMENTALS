import java.util.Scanner;

public class day82 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        int arm=0;
        int t=n;
        while(t>0){
            count++;
            t/=10;
        }
        t=n;
        while(t>0){
            int rem=t%10;
            arm=arm+(int)(Math.pow(rem,count));
            t/=10;
        }
        if(arm==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not");
        }
    }
}
