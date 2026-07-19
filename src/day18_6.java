public class day18_6 {
    public static void main(String[] args) {
        int[] nums={2,2,2};
        int maxx=Integer.MIN_VALUE;
        int increase=0;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                increase++;
            }
            else{
                if(maxx<increase){
                    maxx=increase;
                }
                increase=0;
            }
            System.out.println("increase: "+increase+" at "+i);
        }
        if(maxx<increase){
            maxx=increase;
        }
        System.out.println(maxx+1);
    }
}
