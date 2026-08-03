public class day29_2 {
    public static void main(String[] args) {
        String word="abcdefd";
        char ch='d';
        int index=-1;
       StringBuilder ans=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        System.out.println(index);
        if(index==-1){
            System.out.println(word);
            return;
        }
        for(int i=index;i>=0;i--){
           ans.append(word.charAt(i));

        }
        ans.append(word.substring(index+1,word.length()));
        System.out.println(ans);


    }
}
