public class day31_3 {
    public static void main(String[] args) {
       String  firstWord = "aaa", secondWord = "a", targetWord = "aab";
       int sumfw=0,sumsw=0,sumtw=0;
       for(int i=0;i<firstWord.length();i++){
           int ch=firstWord.charAt(i)-'a';
           sumfw=sumfw*10+ch;
       }
       for(int i=0;i<secondWord.length();i++){
           int num=secondWord.charAt(i)-'a';
           sumsw=sumsw*10+num;
       }
       for(int i=0;i<targetWord.length();i++){
           int num=targetWord.charAt(i)-'a';
           sumtw=sumtw*10+num;
       }
        int total=sumfw+sumsw;
       if(total==sumtw){
           System.out.println(true);
       }
        System.out.println(false);
    }
}
