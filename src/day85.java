import java.util.Scanner;

public class day85 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev=0;
        int t=n;
        while(t!=0){
            int rem=t%10;
            rev=rev*10+rem;
            t/=10;
        }
        System.out.println(rev);
    }
}
