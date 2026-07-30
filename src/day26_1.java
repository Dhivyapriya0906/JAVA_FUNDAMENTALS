public class day26_1 {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,0};
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==0){
                int j=i+1;
                int end= arr.length-1;
                while(end>j) {
                    arr[end]=arr[end-1];
                    end--;

                }
                i++;
                arr[i]=0;
            }


        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
