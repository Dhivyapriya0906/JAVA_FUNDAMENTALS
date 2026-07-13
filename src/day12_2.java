public class day12_2 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 2;
        String[] s1=s.split(" ");
        String ans="";
        for(int i=0;i<k;i++){
            if(i==k-1){
                ans=ans+s1[i];
                break;
            }
            ans=ans+s1[i]+" ";
        }
        System.out.println(ans);
    }
}
