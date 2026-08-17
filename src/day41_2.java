public class day41_2 {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3};
        int a=0,b=0,c=1;
        int count=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                  boolean   cond1=Math.abs(arr[i]-arr[j])<=a;
                  boolean cond2=Math.abs(arr[j]-arr[k])<=b;
                  boolean cond3=Math.abs(arr[i]-arr[k])<=c;
                    if(cond1 && cond2 && cond3 ){
                        count++;

                    }
                }
            }
        }
        System.out.println(count);
    }
}
