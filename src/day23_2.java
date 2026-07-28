public class day23_2 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int r = 3;
        int c = 2;
        int[][] ans=new int[r][c];
        if((mat.length*mat[0].length)==(r*c)){
            int i1=0;
            int j1=0;
            for(int i=0;i<r;i++){


                for(int j=0;j<c;j++){
                    if(j1==mat[0].length ){
                        j1=0;
                        i1++;

                    }
                    ans[i][j]=mat[i1][j1];
                    j1++;

                }

            }
        }
        for(int i[] :ans){
            for(int e:i){
                System.out.print(e+" ");
            }
            System.out.println();
        }
    }
}
