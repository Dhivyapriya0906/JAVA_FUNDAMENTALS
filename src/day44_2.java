public class day44_2 {
    public static void main(String[] args) {
        int[] arr={2,2,2,2,5,5,5,8};
        int k=3;
        int threshold=4;
        int count=0;
        int left=0;
        int sum=0;
        for(int right=0;right<arr.length;right++){
            sum=sum+arr[right];
            if(right-left+1==k){

                int avg=sum/k;
                System.out.println(avg);
                if(avg>=threshold){
                    count++;
                }
                sum=sum-arr[left];
                left++;
                System.out.println("Sum:"+sum);
            }
        }
        System.out.println(count);
    }
}
