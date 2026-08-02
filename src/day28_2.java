public class day28_2 {
    public static void main(String[] args) {
        int num=526;
        int rev=0;
        int rev1=0;
        int t=num;
        while(t>0){
            int rem=t%10;
            rev=rev*10+rem;
            t/=10;

        }
        t=rev;
        while(t>0){
            int rem=t%10;
            rev1=rev1*10+rem;
            t/=10;

        }
        if(rev1==num){
            System.out.println(true);
            return;
        }

    }

}
