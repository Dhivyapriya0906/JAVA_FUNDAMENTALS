public class day14_1 {
    public static void main(String[] args) {
        int n=5;
        int sumOdd=0,sumEven=0;
        int j=1,i=2;
        int count=0;
        while(count<n){

                sumOdd+=j;
                j+=2;
                sumEven += i;
                i += 2;
                count++;

        }
        System.out.print(sumOdd+" "+sumEven+"\n");
        System.out.println(GCD(sumOdd,sumEven));
    }
    public static int GCD(int a, int b){
        int gcd=0;
        while(b!=0){
            gcd=a%b;
            a=b;
            b=gcd;
        }
        return a;
    }
}
