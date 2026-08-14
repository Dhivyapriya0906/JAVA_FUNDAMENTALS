public class day40_3 {
    public static void main(String[] args) {
        int n=4;
        int start=3;
        int ans=0;
        for (int i=0;i<n;i++){
            int sum=start+2*i;
            ans=ans^sum;
        }
        System.out.println(ans);
    }
}
