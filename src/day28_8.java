public class day28_8 {
    public static void main(String[] args) {
        String num="1210";

        int[] count=new int[10];
        for(int i=0;i<num.length();i++){
            int n=(int)num.charAt(i)-'0';
            count[n]++;
        }
        for(int i=0;i<num.length();i++){
            if((int)num.charAt(i)-'0'!=count[i]){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
