public class day21_2 {
    public static void main(String[] args) {
        int[] nums={3,1,2,4};
        int[] ans=new int[nums.length];
        int i=0,j=0,temp=0;
        while(i< nums.length && j< nums.length){
            int ch=nums[j];
            if(ch%2==0){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
