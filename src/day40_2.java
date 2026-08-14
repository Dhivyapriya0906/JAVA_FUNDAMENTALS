public class day40_2 {
    public static void main(String[] args) {
     int[]   prices={8,4,6,2,3};
     int[] ans=prices.clone();
     for(int i=0;i<prices.length-1;i++){
         if(prices[i]>=prices[i+1]){
             ans[i]=prices[i]-prices[i+1];
         }
         else{
             boolean match=false;
             int j=i+1;
             while(!match && j<prices.length){
                 if(prices[i]>=prices[j]){
                     ans[i]=prices[i]-prices[j];
                     match=true;
                 }

                 j++;
             }
         }
     }
     for(int e:ans){
         System.out.print(e+" ");
     }
    }
}
