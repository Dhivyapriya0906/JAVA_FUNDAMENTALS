public class day27_3 {
    public static void main(String[] args) {
        String[] words={"i","love","leetcode"};
        String s="iloveleetcode";
        StringBuilder ans=new StringBuilder();
        for(int i=0;i< words.length;i++){
           ans.append(words[i]);
            if(s.equals(ans.toString())){
                System.out.println(true);
                System.out.println(ans);
                return;
            }
        }
        System.out.println(false);
    }
}
