public class day36_3 {
    public static void main(String[] args) {
        String s = "?zs";
        StringBuilder ans=new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='?'){
                    if(i==0 ){
                        char ch=s.charAt(i+1);
                        ans.append((char)(ch-'a'+1));
                    }
                    else if(i==s.length()-1){
                        char ch=s.charAt(i-1);
                        ans.append((char)(ch-'a'+1));
                    }
                    else{
                        char ch=s.charAt(i+1);
                        char ch2=s.charAt(i-1);


                    }

            }
            else{
                ans.append(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
