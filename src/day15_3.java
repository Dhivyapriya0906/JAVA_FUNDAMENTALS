public class day15_3 {
    public static void main(String[] args) {
        int n=3;
        if(n%2==0){
            System.out.println(n);
            return;
        }
        int i=1;
        int sum=1;
        while(sum%2!=0){
            sum=n*i;
            i++;
        }
        System.out.println(sum);
    }
}
