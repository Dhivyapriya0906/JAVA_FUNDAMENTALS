public class day40_4 {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int cur=0;
        int maxx=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('  ){
                cur++;
                maxx=Math.max(cur,maxx);
            }
            if(s.charAt(i)==')' ){
                cur--;
            }

        }
        System.out.println(maxx);
    }
}
