public class day28_3 {
    public static void main(String[] args) {
        String[] strs={"1","01","001","0001"};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<strs.length;i++){
            int stmax=0;
            int dig=0;
            for(int j=0;j<strs[i].length();j++){
                if(!(strs[i].charAt(j)>='0' && strs[i].charAt(j)<='9')){
                    dig++;
                    break;
                }

            }
            if(dig>0){
                stmax=strs[i].length();
            }
             else{
                  stmax=Integer.parseInt(strs[i]);

            }
            if(stmax>max){
                max=stmax;
            }
        }
        System.out.println(max);

    }
}
