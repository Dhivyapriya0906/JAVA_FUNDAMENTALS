import java.lang.reflect.Array;
import java.util.Arrays;

public class day33_2 {
    public static void main(String[] args) {
        String s = "abaccb";
        int[] distance={1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] dis=new int[distance.length];
        Arrays.fill(dis,-1);
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            if(dis[index]==-1){
                dis[index]=i;
            }
            else{
                int act=i-dis[index]-1;
                if(act!=distance[index]){
                    System.out.println(false);
                    return;
                }
            }

        }
        System.out.println(true);
    }
}
