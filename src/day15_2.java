public class day15_2 {
    public static void main(String[] args) {
        int[] arr={-4,-3,-2,-1,4,3,2};
        int sum=0;
        int high=0;
        for(int i=0;i< arr.length;i++){
            int cur_alt=arr[i];
            sum=sum+cur_alt;
            high=Math.max(high,sum);

        }
        System.out.println(high);
    }
}
