import java.util.Scanner;

public class day84 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long a = 0;
        long b = 1;
        long sum = 0;
        if(n==0 ){
            return;
        }
        if(n==1){
            System.out.println(0);
            return;
        }
        System.out.print(a + " " + b+" ");
        n=n-2;
        while (n > 0) {
            sum = a + b;
            System.out.print(sum + " ");

            a = b;
            b = sum;

            n -= 1;
        }

    }
}
