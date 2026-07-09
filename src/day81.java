import java.util.Scanner;

public class day81 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int rev=0;
        int t=n;
        if(n<0){
            System.out.println("Not Palindrome");
            return;
        }
        while(t>0){
            int rem=t%10;
            rev=rev*10+rem;
            t/=10;

        }
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
