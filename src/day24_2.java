public class day24_2 {
    public static void main(String[] args) {
        String[] words = {"never","give","up","on","you"};
        String s = "ngaoy";
        boolean check=true;

        if (words.length!= s.length()){
            return;
        }
        for(int i=0;i<words.length;i++){
            if(words[i].charAt(0)!=s.charAt(i)){
                check=false;
            }
        }
        System.out.println(check);
    }
}
