import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        //Second Largest Distinct Element
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int max=arr[0];
        int smax=Integer.MIN_VALUE;
        for(int i=0;i< n ; i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];

            } else if (arr[i]>=smax && max!=arr[i] ) {
                smax=arr[i];
            }
            //System.out.println("Max:"+max);
            //System.out.println("SMax:"+smax);

        }

        if(Integer.MIN_VALUE==smax){
            System.out.println(-1);
        }
        else {

            System.out.println(smax);
        }
    }
}
