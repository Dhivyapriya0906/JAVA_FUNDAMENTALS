import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//
public class day51 {
    public static void main(String[] args) {
        String n="aabbddddxccc";
        int max=0;
        StringBuilder ans=new StringBuilder();
        LinkedHashMap<Character,Integer> mpp=new LinkedHashMap<>();
        for (int i=0;i<n.length();i++){
            int get=mpp.getOrDefault(n.charAt(i),0)+1;
            mpp.put(n.charAt(i),get);
            if(max<mpp.get(n.charAt(i))){
                max=mpp.get(n.charAt(i));
            }

        }

    while(max>0){
            for(Map.Entry<Character,Integer> e:mpp.entrySet()){
                if(max==e.getValue()){
                    for (int i=1;i<=max;i++){
                        ans.append(e.getKey());
                }
                }
            }
             max-=1;
}
        System.out.println(ans);
      //  System.out.println(max);
    }
//public static void main(String[] args) {
//    String n="aabbddddxccc";
//    int len=n.length();
//}
}
