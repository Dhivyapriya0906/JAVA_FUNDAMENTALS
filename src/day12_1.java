public class day12_1 {
    public static void main(String[] args) {
        String command = "G()(al)";
        String ans="";
        for (int i=0;i<command.length();i++){
            if(command.charAt(i)==('G')){
                ans=ans+'G';

            }
            else if(command.charAt(i)==('(')  && command.charAt(i+1)==('a')){
                ans=ans+"al";
                i+=3;
            }
            else{
                ans=ans+'o';
                i+=1;
            }
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}
