import java.util.HashMap;

public class day38_1 {
    public static void main(String[] args) {
        String s = "abbcbacbdfhij";
        int left = 0;
        int right = 0;
        int count = 0;
        HashMap<Character, Integer> mpp = new HashMap<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
           mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
            System.out.println("count:"+mpp.get(ch)+" ");

            while(mpp.get(ch)>2){
                char l=s.charAt(left);
                mpp.put(l,mpp.get(ch)-1);
                System.out.println("While: "+mpp.get(l));
                left++;

            }
            int ws=right-left+1;
            count = Math.max(count, ws);

            right++;
        }
        System.out.println(count);
    }
}


