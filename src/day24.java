import java.util.Scanner;
//Given N, print all prime numbers up to N.
public class day24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=1;i<=n;i++){
            int count=0;
            for (int j=1;j<=n;j++){
                if(i%j==0) {
                    count++;
                }
            }
            if(count ==2){
                System.out.println("Prime : "+i);
            }

        }
    }
}
