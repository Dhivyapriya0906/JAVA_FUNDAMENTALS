import java.util.Scanner;

public class day88 {
    public static int FindGDC(int a,int b) {

        int gcd=0;

        if(a==0  ){
           // System.out.println(b);
            return b;
        }
        if(b==0){
            //System.out.println(a);
            return a;
        }
            while(b!=0) {
                gcd = a % b;
                //ystem.out.print(gcd+" ");
                if (gcd == 0) {
                   return b;
                }
                a = b;
                b=gcd;
            }

            return 0;

    }
}
