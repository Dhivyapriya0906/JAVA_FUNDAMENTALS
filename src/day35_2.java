import java.util.Arrays;

public class day35_2 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        Arrays.sort(arr);
        int dif=arr[1]-arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=dif){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
