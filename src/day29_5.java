public class day29_5 {
    public static void main(String[] args) {
        String s = "aaabbb";
        boolean check=false;
//        for (int i=0;i<s.length();i++){
//            if(s.charAt(i)=='b'){
//
//                while(i<s.length() && check){
//                    if(s.charAt(i)=='a'){
//                        check=false;
//                    }
//                    i++;
//                }
//            }
//        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                check=true;
            }
            if(s.charAt(i)=='a' && check){
                System.out.println(false);
                return;
            }
        }
        System.out.println(check);
    }
}
