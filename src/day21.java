import java.util.Scanner;

public class day21 {
    public static void main(String[] args){

        //Write a Java program to check if a number is a Palindrome
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
        int t=n;
        int rev=0;
        while(t>0){
            int rem=t%10;
            rev=rev*10+rem;
            t/=10;
        }
        if(rev==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
