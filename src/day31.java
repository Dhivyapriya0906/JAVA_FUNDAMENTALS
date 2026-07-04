import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        //Sum of Digits Until Single Digit
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int t=n;
        int sum=0;
        int dig=t;

        while(dig>9){
            sum=0;

           while(t!=0) {
               sum += t % 10;
               t = t / 10;
           }
           dig=sum;
           t=sum;

       }
        if(t<10){
            System.out.println("Sum: "+t);
        }
       else {
            System.out.println("Sum:" + sum);
        }
    }
}
