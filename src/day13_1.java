public class day13_1 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int count=0;
        for (int i=0;i< words.length;i++){
            int len=words[i].length();
            int c=0;
            for(int j=0;j<words[i].length();j++) {
                if (allowed.indexOf(words[i].charAt(j)) != -1) {
                    c++;

                }
            }
            if(len==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
