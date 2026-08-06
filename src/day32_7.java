import java.util.HashMap;

public class day32_7 {
    public static void main(String[] args) {
        String[] words1={"a", "b"};
        String[] words2={"a", "a"};
        int count=0;
        HashMap<String,Integer> mpp1=new HashMap<>();
        HashMap<String,Integer> mpp2=new HashMap<>();
        for(int i=0;i<words1.length;i++){
            mpp1.put(words1[i],mpp1.getOrDefault(words1[i],0)+1);
        }
        for(int i=0;i<words2.length;i++){
            mpp2.put(words2[i],mpp2.getOrDefault(words2[i],0)+1);
        }
        for (String word : mpp1.keySet()) {
            if (mpp1.get(word) == 1 && mpp2.getOrDefault(word, 0) == 1) {
                count++;
            }
        }


    }
}
