public class day24_1 {
    public static void main(String[] args) {
        String s="aegfa";
        int left=0;
        int right=s.length()-1;
        char[] ans=s.toCharArray();

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                if((int)s.charAt(right) < (int)s.charAt(left)){

                    ans[left]=(s.charAt(right)) ;
                    ans[right]=s.charAt(right);
                }
                else{
                    ans[right]=s.charAt(left);
                    ans[left]=s.charAt(left);
                }
            }

            right--;
            left++;
        }
        for(char e:ans){
            System.out.print(e+" ");
        }
    }
}
