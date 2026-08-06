public class day32_5 {
    public static void main(String[] args) {
        String s = "10#11#12";
        StringBuilder ans=new StringBuilder();
        for(int i=s.length()-1;i>0;i--){
            if(s.charAt(i)=='#'){
                int num=(s.charAt(i-2)-'0')*10 +(s.charAt(i-1)-'0');
                char ch=(char)('a'+num-1);
                ans.append(ch);
                i-=2;
            }
            else{
                int num=(char)(s.charAt(i)-'0');
                char ch=(char)('a'+num-1);
                ans.append(ch);

            }
        }
        System.out.println(ans.reverse());
    }
}
