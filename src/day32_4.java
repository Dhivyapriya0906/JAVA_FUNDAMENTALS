public class day32_4 {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 615 green and 12 yellow marbles";
        String[] ans=s.split(" ");
        int num=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i].matches("\\d+")){
                int n=Integer.parseInt(ans[i]);
                if(num>=n){
                    System.out.println(false);
                    return;
                }
                num=n;
            }

        }
        System.out.println(true);
    }
}
