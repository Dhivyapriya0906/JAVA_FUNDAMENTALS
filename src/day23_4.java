public class day23_4 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,-1},{4,-1,6},{7,8,9}};
        int[] max=new int[matrix[0].length];
        for(int e[]:matrix){
            for(int c:e){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int col=0;col< matrix[0].length;col++) {
            max[col] = matrix[0][col];
            for (int row = 0; row < matrix.length; row++) {
                    if(max[col]<matrix[row][col]){
                        max[col]=matrix[row][col];
                    }
            }
        }
        for(int col=0;col< matrix[0].length;col++){



            for(int row=0;row<matrix.length;row++){
                if(matrix[row][col]==-1){
                    matrix[row][col]=max[col];
                }
            }

        }
        for(int e[]:matrix){
            for(int c:e){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
