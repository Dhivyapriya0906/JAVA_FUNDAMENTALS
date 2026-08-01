public class day27_1 {
    public static void main(String[] args) {
        String[] words={"a","a"};
        String s="aa";
        int count=0;
        for(String word:words){
            if(s.startsWith(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}
