import java.util.HashMap;
import java.util.Map;

public class day20_6 {
    public static void main(String[] args) {
        String s = "abcabc" ,target = "aabc";
        HashMap<Character,Integer> mpp=new HashMap<>();
        HashMap<Character,Integer> mppt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(target.indexOf(ch)!=-1){
                mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            }
        }
        for(int i=0;i<target.length();i++){
            char ch=target.charAt(i);

            mppt.put(ch,mppt.getOrDefault(ch,0)+1);

        }
        System.out.println(mpp);
        System.out.println(mppt);
        int min=Integer.MAX_VALUE;
        for (char ch : mppt.keySet()) {
            int div = mpp.getOrDefault(ch, 0) / mppt.get(ch);
            min = Math.min(min, div);
        }
        System.out.println(min);
    }
}
