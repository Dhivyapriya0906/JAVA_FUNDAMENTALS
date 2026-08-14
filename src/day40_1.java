public class day40_1 {
    public static void main(String[] args) {
        int[] arr={17,18,5,4,6,1};
        int[] ans=new int[arr.length];
        if(arr.length==1)
            ans[0]=-1;
        for(int i=0;i< arr.length-1;i++){
            int maxx=arr[i+1];
            for(int j=i+1;j<arr.length;j++){
                if(maxx<arr[j]){
                    maxx=arr[j];
                }
            }
            System.out.println(maxx);
            ans[i]=maxx;
        }
        ans[arr.length-1]=-1;
        for(int e=0;e<ans.length;e++){
            System.out.print(ans[e]+" ");
        }
    }
}
