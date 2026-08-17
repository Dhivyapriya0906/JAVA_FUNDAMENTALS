import java.util.HashMap;
import java.util.Map;

public class day43_1 {
    public static void main(String[] args) {
        String s = "anagcram", t = "nbagaram";
        if(s.length()!=t.length()){
            System.out.println(false);
            return;
        }
        HashMap<Character,Integer> sfreq=new HashMap<>();
        HashMap<Character,Integer> tfreq=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char csh=s.charAt(i);
            char tch=t.charAt(i);
            sfreq.put(csh,sfreq.getOrDefault(csh,0)+1);
            tfreq.put(tch,tfreq.getOrDefault(tch,0)+1);

        }
        for (Character key : sfreq.keySet()){
            if(sfreq.get(key)!=tfreq.get(key)){
                System.out.println(false);
                return ;
            }
        }
        System.out.println(true);
    }
}
