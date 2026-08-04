import java.util.HashMap;

public class day20_3 {
    public static void main(String[] args) {
        String s = "abccbaacz";
        HashMap<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
            if(mpp.get(ch)>1){
                System.out.println(ch);
                break;
            }
        }

    }
}
