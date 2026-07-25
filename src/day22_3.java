public class day22_3 {
    public static void main(String[] args) {
        int image[][]={ {1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};

        for (int i = 0; i < image.length; i++) {
            int left = 0;
            int right = image[i].length - 1;

            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                left++;
                right--;
            }
        }
        for (int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j]=1-image[i][j];
                System.out.print(image[i][j]+" ");
            }
            System.out.println();
        }

    }
}
