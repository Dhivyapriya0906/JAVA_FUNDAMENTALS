public class day29_6 {
    public static void main(String[] args) {
        int num=30;
        int i=1;
        int count=0;
        while(i<=num){
                int t=i;
                int sum=0;
                while(t>0){
                    int rem=t%10;
                    sum=sum+rem;
                    t/=10;
                }
                if(sum%2==0){
                    count++;
                }
                i++;

        }
        System.out.println(count);
    }
}
