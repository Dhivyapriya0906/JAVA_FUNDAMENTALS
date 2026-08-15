public class day42_1 {
    public static void main(String[] args) {
        int[] arr={2,6,4,1,3,5};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
             count++;
            }
            else{
                count=0;
            }
            if(count==3){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
