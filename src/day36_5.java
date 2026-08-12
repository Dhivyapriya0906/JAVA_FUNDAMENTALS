import java.util.*;

public class day36_5 {
    public static void main(String[] args) {
        String word1="abccc";
        String word2="baaac";
        if(word2.length()!=word1.length()){
            System.out.println("Length not equal :"+false);
            return;
        }
        HashMap<Character,Integer> freq1=new HashMap<>(26);
        HashMap<Character,Integer> freq2=new HashMap<>(26);
        for(int i=0;i<word1.length();i++){
            freq1.put(word1.charAt(i),freq1.getOrDefault(word1.charAt(i),0)+1);

        }
        for(int i=0;i<word2.length();i++){
            freq2.put(word2.charAt(i),freq2.getOrDefault(word2.charAt(i),0)+1);

        }
        for(int )
        ArrayList<Integer> f1=new ArrayList<>(freq1.values());
        ArrayList<Integer> f2=new ArrayList<>(freq2.values());
        Collections.sort(f1);
        Collections.sort(f2);
        for (int i=0;i<)


    }
}
