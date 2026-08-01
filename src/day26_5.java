import java.util.HashMap;

public class day26_5 {
    public static void main(String[] args) {
        String[] arr={"aaa","aa","a"};
        int k=1;
        HashMap<String,Integer> map=new HashMap<>();
        for(String c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        String find="";
        for(String ch:arr){
            if(map.get(ch)==1 ){
                k--;
                if(k==0) {
                    find = ch;
                }
            }

        }
        System.out.println(find);
    }
}
