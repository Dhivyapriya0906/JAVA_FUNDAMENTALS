public class day12_5 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] s1=s.split(" ");
        String[] ans=new String[s1.length];
        for(int i=0;i< ans.length;i++){
            int len=s1[i].length();
            char ch = s1[i].charAt(len - 1);
            int pos=ch-'0';
            ans[pos-1]=s1[i].substring(0,len-1);



        }
        System.out.println(String.join(" ",ans));
    }
}
