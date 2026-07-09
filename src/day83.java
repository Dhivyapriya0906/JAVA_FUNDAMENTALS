import java.util.Scanner;

public class day83 {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        long fact =1;
        while(n>0){
            fact*=n;
            n-=1;

        }
        System.out.println(fact);

    }
}
