import java.util.Scanner;

public class day89 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b= scan.nextInt();
        day88 d=new day88();

        int gcd=d.FindGDC(a,b);
        System.out.println((int)((a*b)/gcd));
    }
}
