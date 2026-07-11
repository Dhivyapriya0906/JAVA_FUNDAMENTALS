import java.util.Arrays;
import java.util.Scanner;

public class day91 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int left = scan.nextInt();
        int right = scan.nextInt();
        int prev = -1;
        int firans = -1;
        int secans = -1;
        int minGap = Integer.MAX_VALUE;

        boolean[] ans=new boolean[right+1];
        Arrays.fill(ans,true);
//        while (left <= right) {
//            int c = 0;
//            for (int i = 2; i <=(int) (Math.sqrt(left)); i++) {
//                if (left < 2) {
//                    left++;
//                    continue;
//                }
//                if (left % i == 0) {
//                    c++;
//                }
//            }
//            if (left >= 2 && c == 0) {
//                int gap = Integer.MAX_VALUE;
//                if (prev != -1) {
//                    gap = left - prev;
//                }
//                if (gap < minGap) {
//                    minGap = gap;
//                    firans = prev;
//                    secans = left;
//
//                }
//                prev=left;
//            }
//            left++;
//        }
        if(right>=0)    ans[0]=false;
        if(right>=1)    ans[1]=false;
        for(int i=2;i*i<=right;i++){
            if(ans[i]){
                for(int j=i*i;j<=right;j+=i){
                    ans[j]=false;
                }
            }
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]){
                System.out.print(i+" ");
            }
        }
        for(int i=left;i<=right;i++){
            if (ans[i]) {

                if (prev != -1) {
                    int gap = i - prev;

                    if (gap < minGap) {
                        minGap = gap;
                        firans = prev;
                        secans = i;
                    }
                }

                prev = i;
            }
        }
        if (firans == -1) {
            System.out.println("[" + -1 + "," + -1 + "]");
        }

        System.out.println("[" + firans + "," + secans + "]");
    }
}