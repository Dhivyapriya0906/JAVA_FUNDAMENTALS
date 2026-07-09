import java.util.Scanner;

public class day87 {
    public static void main(String[] args) {


                Scanner scan=new Scanner(System.in);
                int n=scan.nextInt();
                int sum=0;
                int t=n;
            if(n==0){
                System.out.println(1);
                return;
            }
                while(t!=0){


                    sum+=1;
                    t/=10;
                }
        System.out.println(sum);
    }
}
