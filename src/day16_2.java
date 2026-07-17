import java.util.Arrays;

public class day16_2 {
    public static void main(String[] args) {
    int num=1234;
    int[] dig=new int[4];
    int t=num;
    int i=0;
    while(t>0){
        int rem=t%10;
        dig[i]=rem;
        t=t/10;
        i++;
    }
    Arrays.sort(dig);
    int n1=dig[0]*10+dig[2];
    int n2=dig[1]*10+dig[3];
        System.out.println(n1+n2);

    }
}
