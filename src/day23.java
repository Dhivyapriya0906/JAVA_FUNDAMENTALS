public class day23 {
    public static void main(String[] args) {
        //Find the second largest element in an array without using sorting
        int[] arr={12,5,6,8,2,45,9};
        int maxi=arr[0] ,  smax=arr[1];
        for (int i=0;i<arr.length;i++){
            if(arr[i]<maxi){
                maxi=arr[i];
            } else if (maxi<smax && smax>arr[i]) {
                smax=arr[i];
            }

        }
        System.out.println("Max: "+maxi);
        System.out.println("Sec Max : "+smax);
    }
}

