public class day17_4 {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        int j=-1;
        for(int i=0;i< nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
        for(int i=j+1;i< nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        for(int e:nums){
            System.out.print(e+" ");
        }
    }
}
//      0,1,2,3,4
//nums={0,1,0,3,12}
//j=0
//i=1       nums[1]=1       1!=0    T
//                                  temp =1         nums[1]=0       nums[0]=1           {1,0,0,3,12}        j=1
//i=2       nums[2]=0       0!=0    F
//i=3       nums[3]=3       3!=0    T
//                                  temp=3          nums[3]=0       nums[1]=3           {1,3,0,0,12}        j=2
//i=4       nums[4]=12       12!=0    T
//                                     tem=12       nums[4]=0       nums[2]=12          {1,3,12,0,0}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
