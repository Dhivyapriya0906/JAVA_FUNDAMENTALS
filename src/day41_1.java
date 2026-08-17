public class day41_1 {
    public static void main(String[] args) {
        int[][] rectangle = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        SubrectangleQueries srq=new SubrectangleQueries(rectangle);
        srq.updateSubrectangle(0,1,1,2,99);
        System.out.println(srq.getValue(1,1));
    }
}
class SubrectangleQueries {
    int[][] rectangle;
    public SubrectangleQueries(int[][] rectangle) {
            this.rectangle=rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
                for (int i=row1;i<=row2;i++){
                    for(int j=col1;j<=col2;j++){
                        rectangle[i][j]=newValue;
                    }
                }


    }

    public int getValue(int row, int col) {
            return rectangle[row][col];
    }
}

