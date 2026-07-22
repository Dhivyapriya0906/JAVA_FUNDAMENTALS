public class day20_1 {
    public static void main(String[] args) {
        int[] s={1,2,3};        //cookie
        int[] g={1,1};          //child
        int j=0,i=0,count=0;            //i=child , j= cookie
        while(i<s.length && j< g.length){
            if(g[j]<=s[i]){
                count++;
                j+=1;
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(count);
    }
}
