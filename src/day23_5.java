public class day23_5 {
    public static void main(String[] args) {
        String s="aaabaaaa";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(sb.length()<2){
                sb.append(ch);
            }
            else if(sb.charAt(sb.length()-1)==ch && sb.charAt(sb.length()-2)==ch){
                continue;
            }
            else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
