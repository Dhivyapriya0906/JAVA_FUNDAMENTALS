public class day51_1{

        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };
            int n=matrix.length;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("__________________________________");
            // Your logic here
            // Step 1: Transpose
            // Step 2: Reverse each row
            for(int row=0;row<matrix.length;row++){
                for(int col=row+1;col<matrix[row].length;col++){
                    int temp=matrix[row][col];
                    matrix[row][col]=matrix[col][row];
                    matrix[col][row]=temp;
                    //System.out.println(matrix[row][col]);
                }
            }


            // Print matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            for(int row=0;row<n;row++){
                for(int col=0;col<n/2;col++){
                    int temp=matrix[row][col];
                    int t=n-col-1;
                    matrix[row][col]=matrix[row][t];
                    matrix[row][t]=temp;
                }
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
            // Print matrix
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

