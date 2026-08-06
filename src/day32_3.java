public class day32_3 {
    public static void main(String[] args){

    String s = "l|*e*et|c**o|*de|";
    int count = 0;
    int i = 0;
        boolean flag=true;
    while(i<s.length()){
        if(s.charAt(i)=='|' && flag){
            flag=false;
        }
        else if(s.charAt(i)=='|' && !flag){
            flag=true;
        }
        if(s.charAt(i)=='*' && flag){
            count++;
        }
i++;

    }

        System.out.println(count);
}

}
