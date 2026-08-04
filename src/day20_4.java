public class day20_4 {
    public static void main(String[] args) {
        String current = "02:30", correct = "04:35";
        int curhr=0;
        int curmin=0;
        int corhr=0;
        int cormin=0;
        for(int i=0;i<current.length();i++){
            if(i==0 ){
                int remcur=(int)current.charAt(i)-'0';
                int remcor=(int)correct.charAt(i)-'0';
                curhr=remcur;
                corhr=remcor;
            }
            else if(i==1){
                int remcur=(int)current.charAt(i)-'0';
                int remcor=(int)correct.charAt(i)-'0';
                curhr=curhr*10+remcur;
                corhr=corhr*10+remcor;
            }
            else if(i==3){
                int remcur=(int)current.charAt(i)-'0';
                int remcor=(int)correct.charAt(i)-'0';
                curmin=remcur;
                cormin=remcor;
            }
            else if(i==4){
                int remcur=(int)current.charAt(i)-'0';
                int remcor=(int)correct.charAt(i)-'0';
                curmin=curmin*10+remcur;
                cormin=cormin*10+remcor;
            }
        }
        System.out.println("Current hr: "+curhr+" Min: "+curmin);
        System.out.println("Correct hr: "+corhr+" Min: "+cormin);

    }
}
