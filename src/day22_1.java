public class day22_1 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<mat.length;i++) {
            int n= mat.length-i-1;
            for (int j = 0; j < mat[i].length; j++) {

                System.out.println(n);
                if (i == j || j==n) {
                    sum = sum + mat[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}
