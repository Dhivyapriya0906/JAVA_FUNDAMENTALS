import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        int t=n;
        while(t!=0){
            int rem=t%10;
            sum+=rem;
            t/=10;
        }

        System.out.println((int) Math.abs(sum));
    }
}
