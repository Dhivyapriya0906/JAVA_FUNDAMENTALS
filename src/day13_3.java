import java.util.ArrayList;

public class day13_3 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        ArrayList<Boolean> ans=new ArrayList<>(candies.length);
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(maxx<candies[i]){
                maxx=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            int c=candies[i]+extraCandies;
            if(maxx<=c){
                ans.add(i,true);
            }
            else{
                ans.add(i,false);
            }

        }
for(boolean c:ans){
    System.out.print(c+" ");
}
    }
}
