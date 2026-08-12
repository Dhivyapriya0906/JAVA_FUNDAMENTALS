import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class day35_6 {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String, ArrayList<String>>  mpp=new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String n=new String(ch);
            if (!mpp.containsKey(n)) {
                mpp.put(n, new ArrayList<>());
            }

            mpp.get(n).add(strs[i]);
        }
       // System.out.println(mpp);
        List<List<String>>  a=new ArrayList<>();
        a.addAll(mpp.values());
        System.out.println(a);
    }
}
