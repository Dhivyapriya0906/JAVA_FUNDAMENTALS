public class day12_4 {
    public static void main(String[] args) {
        int[] indices={4,5,6,7,0,2,1,3};
        String s="codeleet";
        char[] ans=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            char c=s.charAt(i);
            int d=indices[i];
            ans[d]=c;
        }
        System.out.println((ans.toString()));
    }
}
