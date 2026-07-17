public class day16_4 {
    public static void main(String[] args) {
        int n=8;
        int count=0;
        int a=1;
        int b=2;
        int i=3;
        while(a<=n){
            i++;
            int c=(int)Math.pow(i,2);
            if(c==(int)Math.pow(a,2)+(int)Math.pow(b,2)){
                count+=2;
            }
            a++;
            b++;
        }
        System.out.println(count);
    }
}
