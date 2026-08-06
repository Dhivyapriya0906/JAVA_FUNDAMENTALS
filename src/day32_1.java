public class day32_1 {
    public static void main(String[] args) {
        int n=0;
        int t=2;

        int prod= FindProd(n);

//        if(n>=10) {
//            rem = n % 10;
//            quo = n / 10;
//            prod=rem*quo;
//        }
//        else{
//           prod=n;
//        }
//        System.out.println(rem+" "+quo);
//        if(prod%t==0){
//            System.out.println(n);
//            return;
//        }
//
//        while(prod%t!=0){
//            n=n+1;
//            rem=n%10;
//            quo=n/10;
//            prod=rem*quo;
//        }
//        System.out.println(n);
        while(prod%t!=0){
            n=n+1;
            prod=FindProd(n);

        }
        System.out.println(n);

    }
    static int FindProd(int n){
        int prod=1;
        while(n>0){
            int rem=n%10;
            prod*=rem;
            n/=10;

        }
        return prod;
    }
}
