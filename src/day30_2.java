public class day30_2 {
    public static void main(String[] args) {
        String s="??:5?";
        char h=s.charAt(0);
        char hh=s.charAt(1);
        char m=s.charAt(3);
        char mm=s.charAt(4);
        if(h=='?'){
            if(hh=='1' || hh=='0' || hh=='?'){
                h='1';
            }
            else {
                h = '0';
            }
        }
        if(hh=='?'){
            if (h == '1') {
                hh='1';
            }
            else{
                hh='9';
            }
        }
        if(m=='?'){
            m='5';
        }
        if(mm=='?'){
            mm='9';
        }
        StringBuilder ans=new StringBuilder();
        ans.append(h);
        ans.append(hh);
        ans.append(":");
        ans.append(m);
        ans.append(mm);
        System.out.println(ans);


    }
}
