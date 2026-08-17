public class day44_1 {
    public static void main(String[] args) {
        String s = "weallloveyou";
        int k=7;
        int i=0;
        int vcount=0;
        while(i+k<=s.length()){
            int count=0;
            String check="";

                check=s.substring(i,i+k);

            System.out.println(check);
            for(int j=0;j<check.length();j++){
                char ch=check.charAt(j);
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    count++;
                }
            }
            vcount=Math.max(count,vcount);
            i++;

        }
        System.out.println(vcount);
    }
}
