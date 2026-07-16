public class day15_1 {
    public static void main(String[] args) {
        int n=1248;
        int count=0;
        int t=n;
        while(t>0){
            int rem=t%10;
            if(n%rem==0){
                count++;
            }
            t=t/10;
        }
        System.out.println(count);
    }
}
