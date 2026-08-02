public class day28_5 {
    public static void main(String[] args) {
        String s="01";
        int cOnes=0;
        int cZeros=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                cZeros++;
            }
            else{
                cOnes++;
            }
        }

            cOnes--;

        System.out.println(cZeros+" "+cOnes);
        for(int i=0;i<cOnes;i++){
            ans.append('1');
        }
        for(int i=0;i<cZeros;i++){
            ans.append('0');
        }
        ans.append('1');
        System.out.println(ans);
    }
}
