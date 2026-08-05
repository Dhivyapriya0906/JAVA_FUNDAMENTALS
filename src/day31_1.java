public class day31_1 {
    public static void main(String[] args) {
        String s = "book";
        String first=s.substring(0,s.length()/2);
        String sec=s.substring(s.length()/2);
        String vow="aeiouAEIOU";
        int countf=0;
        int counts=0;
        for (int i=0;i<first.length();i++){
            if(vow.indexOf(first.charAt(i))!=-1){
                countf++;
            }

        }
        for (int i=0;i<sec.length();i++){
            if(vow.indexOf((sec.charAt(i)))!=-1){
                counts++;
            }

        }
        if(countf==counts){
            System.out.println(true);
        }
    }
}
