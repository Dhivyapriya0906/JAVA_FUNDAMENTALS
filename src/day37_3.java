import java.util.ArrayList;
import java.util.Arrays;

public class day37_3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 17, 13, 28, 23},
                {17, 22, 16, 29, 24},
                {24, 28, 22, 34, 23},
                {11, 13, 14, 37, 18},
                {45, 44, 32, 37, 23},
                {36, 48, 27, 18, 16}
        };
        int[] minrow=new int[matrix.length];
        int[] maxcol=new int[matrix[0].length];
        for(int row=0;row<matrix.length;row++){
            int min=Integer.MAX_VALUE;

            for(int col=0;col<matrix[row].length;col++){
               int min1=matrix[row][col];
                if(min>min1){
                    min=min1;
                }

            }

            minrow[row]=min;


        }
        for(int col=0;col<matrix[0].length;col++){
            int max=Integer.MIN_VALUE;
            for(int row=0;row<matrix.length;row++){
                int max1=matrix[row][col];
                if(max1>max){
                    max=max1;
                }
            }
            maxcol[col]=max;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<minrow.length;i++){
            int check=minrow[i];
            for (int j=0;j<maxcol.length;j++){
                if(check==maxcol[j]){
                    ans.add(check);
                }
            }
        }
        if(ans.isEmpty()){
            System.out.println(-1);
            return;
        }
        System.out.println(ans);



    }
}
