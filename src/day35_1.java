import java.lang.reflect.Array;
import java.util.ArrayList;

public class day35_1 {
    public static void main(String[] args) {
        int n=7;
        ArrayList<Integer> ans=new ArrayList<>();
        if(n==1 ){
            ans.add(0);
            return;
        }
        int i=1;
        while(i<n){
            int num=i;
            ans.add(num);
            ans.add(-num);
            i+=2;
        }
        ans.add(0);

        System.out.println(ans);
    }
}
