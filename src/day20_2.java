import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.reverse;

public class day20_2 {
    public static void main(String[] args) {
                    //0 1 2 3 4
        int[] score={10,2,4,6,5};
        Arrays.sort(score);
        //0 1 2 3 4
        //2 4 5 6 10
        int[] sort1=new int[score.length];
        int n=score.length;
        String[] ans=new String[n];

        sort1[0]=score[n-1];
        // 10 6 5 4 2
        for(int i= score.length-1;i>0;i--){
            sort1[n-i]=score[i-1];
        }

        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(score[i]==sort1[j]){
                    if(j==0){
                        ans[i]="Gold Medal";
                    }
                    if(j==1){
                        ans[i]="Silver Medal";
                    }
                    if(j==2){
                        ans[i]="Bronze Medal";
                    }
                    else{
                        ans[i]=String.valueOf(i);
                    }
                }

            }
        }
        for(String e:ans){
            System.out.print(e+" ");
        }



    }
    static int[] SortArray(int[] score){
        Arrays.sort(score);
        reverse(Collections.singletonList(score));
        return score;
    }
}
