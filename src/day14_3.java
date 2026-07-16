public class day14_3 {
    public static void main(String[] args) {
        int n=234;
        int prod=1;
        int sum=0;
        int t=n;
        while(t>0){
            int rem=t%10;
            prod*=rem;
            sum+=rem;
            t=t/10;
        }
        System.out.println(prod+" "+sum);
        System.out.println("subtractProductAndSum: "+(prod-sum));
    }
}
