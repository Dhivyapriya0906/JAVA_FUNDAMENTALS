public class day52 {
    public static void main(String[] args) {
        String str = "01010111";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println("Number of 1's in the string: " + count);
        int st=0,end=count;
        int min=Integer.MAX_VALUE;
        while(end<=str.length()){
            int c=0;
            for(int i=st;i<end;i++){
                if(str.charAt(i)=='1'){
                    c++;
                }
            }
            if(min>(count-c)){
                min=count-c;
            }
            st++;
            end++;
        }
        System.out.println("Consequent 1's to be removed to make all 1's together: "+min);
    }
}