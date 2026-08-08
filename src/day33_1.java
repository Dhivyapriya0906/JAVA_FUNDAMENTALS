public class day33_1 {
    public static void main(String[] args) {
        String s = "XXOX";
        //String ans="";
        int movess=0;
        int i=0;
        while(i< s.length() ) {
            if (s.charAt(i) != 'O') {
                i+=3;
                movess++;
            } else {

                i++;
            }
        }
        System.out.println(movess);
        //System.out.println(ans);
    }
}
