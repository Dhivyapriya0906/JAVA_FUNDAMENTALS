public class day12_3 {
    public static void main(String[] args) {
        String[] word1={"abc", "d", "defg"};
        String[] word2={"abcddefg"};
        String w1="";
        String w2="";
        for (int i=0;i<word1.length;i++){
            w1+=(word1[i]);
        }
        for (int i=0;i<word2.length;i++){
            w2+=(word2[i]);
        }
        if(w1.equals(w2)){
            System.out.println(true);

        }
        System.out.println(false);
    }
}
