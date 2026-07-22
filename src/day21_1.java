public class day21_1 {
    public static void main(String[] args) {
        int[] arr={1,-3,5,6,-4};
        int n= arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int m=i-j+1;
                if(m%2!=0){
                for(int k=i;k<=j;k++) {

                        sum += arr[k];
                        System.out.print(arr[k] + " ");

                }
                }
                System.out.println();
            }

        }
        System.out.println("SUM:"+sum);
    }
}
