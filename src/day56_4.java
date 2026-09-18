import java.util.*;

public class day56_4 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        ArrayList<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int col = left; col <= right; col++) {
                ans.add(matrix[top][col]);
            }
            top++;

            // Top → Bottom
            for (int row = top; row <= bottom; row++) {
                ans.add(matrix[row][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    ans.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    ans.add(matrix[row][left]);
                }
                left++;
            }
        }

        System.out.println(ans);
    }
}