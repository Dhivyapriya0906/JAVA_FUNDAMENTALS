public class day28_1 {
    public static void main(String[] args) {
        int[] nums={5,6,2,3};
        int min=Integer.MAX_VALUE;
        for(int i=0;i< nums.length;i++){
            if(i%10==nums[i]){
                int temp=i;
                if(temp<min){
                    min=temp;
                }
            }
        }
        System.out.println(min);
    }
}
