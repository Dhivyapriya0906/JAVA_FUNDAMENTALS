public class day23_1 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2},
                {3, 1}
        };
            boolean found=true;
            for(int i=1;i<matrix.length;i++){
                for(int j=1;j<matrix[0].length;j++){
                    if(matrix[i-1][j-1]!=matrix[i][j]){
                        found=false;

                    }
                }
            }
            System.out.println(found);

    }
}
