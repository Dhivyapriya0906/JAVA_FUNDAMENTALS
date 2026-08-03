public class day29_4 {
    public static void main(String[] args) {
        String[] words={"abc","car","ada","racecar","cool"};
        String ans="";
        for(int i=0;i< words.length;i++){
            int left=0;
            int right=words[i].length()-1;
            boolean check=true;
            while(left<right){
                if(words[i].charAt(left)!=words[i].charAt(right)){
                    check=false;
                    break;
                }
                left++;
                right--;
                check=true;
            }
            if(check){
                ans=words[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
