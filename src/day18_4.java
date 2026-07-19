public class day18_4 {
    public static void main(String[] args) {
        int[] flowerbed={1,0,0,0,1};
        int n=1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if((i==0 || flowerbed[i-1]==0)&& (i== flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i]=1;
                    n-=1;
                    if(n==0){
                        break;
                    }
                }
            }

        }
        for(int e:flowerbed){
            System.out.print(e+" ");
        }
    }
}
