public class day28_4 {
    public static void main(String[] args) {
        String num="51230100";
        String ans="";
        int n=0;
        for(int i=num.length()-1;i>-1;i--){
            if(num.charAt(i)=='0'){
                n++;
            }
            else{
                break;
            }
        }
        for(int i=0;i<num.length()-n;i++){
            ans=ans+num.charAt(i);
        }
        System.out.println(ans);
    }
}
