public class day42 {
    public static void main(String[] args) {
        String s="abcd";
        String t="bcda";
        if(s.length()!=t.length()){
            System.out.println("false");
        }
        else{

            String s1=s;
            for (int i=0;i<s.length();i++){
                if(s1.equals(t)){
                    //System.out.println("true");
                    break;
                }
                s1=s1.substring(1,s.length())+s1.charAt(0);

                //System.out.println(s1);

            }
            if(s1.equals(t)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
        //Another Approach
        String temp=s+s;
        if(temp.contains(t)){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
