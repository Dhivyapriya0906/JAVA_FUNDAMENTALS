import java.util.HashSet;

public class day33_3 {
    public static void main(String args[]){
        String[] words = {"cd", "ac", "dc", "ca", "zz"};
        int count = 0;
//        for (int i = 0; i < words.length;i++){
//            String rev=""+words[i].charAt(1)+words[i].charAt(0);
//            for(int j=i+1;j< words.length;j++){
//                if(rev.equals(words[j])){
//                    count++;
//                }
//            }
//        }
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String rev=""+words[i].charAt(1)+words[i].charAt(0);
            if (hs.contains(rev)) {
                count++;
            }
            hs.add(words[i]);
        }

        System.out.println(count);
    }
}
