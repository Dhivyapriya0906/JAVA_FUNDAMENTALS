public class day22_2 {
    public static void main(String[] args) {
        int n=124;
        int maxx=Integer.MIN_VALUE;
        int maxx2=Integer.MIN_VALUE;
        while(n>0){
            int rem=n%10;
            if(maxx<rem){
                maxx2=maxx;
                maxx=rem;
            }
            else if(maxx2<rem &&maxx>maxx2){
                maxx2=rem;
            }
            n=n/10;
        }
        System.out.println(maxx);
        System.out.println(maxx2);
    }
}
