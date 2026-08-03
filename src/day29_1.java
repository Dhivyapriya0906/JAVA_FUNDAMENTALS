public class day29_1 {
    public static void main(String[] args) {
        String s = "abacbc";
        int[] ans=new int[26];

        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            ans[n]++;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            if(ans[n]!=0) {
                count = ans[n];
                break;
            }
        }
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            if(ans[n]!=count && ans[n]!=0){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
        return;
    }
}
