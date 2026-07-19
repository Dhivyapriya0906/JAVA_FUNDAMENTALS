public class day18_7 {
    public static void main(String[] args) {
        int[] nums={10,2,5,2};
        int maxx=nums[0];
        int smax=-1;
        for(int i=1;i< nums.length;i++){
            if(maxx<nums[i]){
                smax=maxx;
                maxx=nums[i];
            }
            else if(maxx>smax && smax<nums[i]){
                smax=nums[i];
            }
        }
        System.out.println("Max: "+maxx+ " Sec Maxx: "+smax);
        System.out.println((maxx-1)*(smax-1));
    }
}
