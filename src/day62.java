public class day62 {
    public static void main(String[] args) {
        Solution1 s1=new Solution1();
        System.out.println(s1.sumAndMultiply(65463628));
    }
}
class Solution1 {
    public long sumAndMultiply(int n) {
        int t=n;
        int con=0;
        int sum=0;
        while(t>0){
            int rem=t%10;
           if(rem!=0) {
               con = con * 10 + rem;
               sum=sum+rem;
           }
            t=t/10;
        }
        t=con;
        con=0;
        System.out.println(t);
        while(t>0){
            int rem=t%10;
            con=con*10+rem;
            t=t/10;
        }
        System.out.println(con*sum);
        System.out.println(con);
    return sum;
    }

}
