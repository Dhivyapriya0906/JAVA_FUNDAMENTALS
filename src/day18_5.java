public class day18_5 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int maxx=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(maxx<nums[i] && nums[i]!=nums[index]){
                maxx=nums[i];
                index=i;
            }
        }
        int count=0;

        for(int i=0;i<nums.length;i++ ){
            int prod=nums[i]*2;
            if(prod<=maxx){
                count++;
                System.out.println(count);
            }

        }
        if(count>= nums.length-1){
            System.out.println(index);
            return;
        }
        System.out.println(-1);
    }
}
