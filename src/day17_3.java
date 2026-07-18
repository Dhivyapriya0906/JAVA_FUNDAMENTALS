import java.util.Arrays;

public class day17_3 {
    public static void main(String[] args) {

        int[] nums1 = {};
        int[] nums2 = {1};

        int m = 0;
        int n = 1;

        int add = m + n;
        int[] ans = new int[add];

        // If nums1 has no valid elements
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                System.out.print(nums2[i] + " ");
            }
            return;
        }

        // If nums2 has no valid elements
        if (n == 0) {
            for (int i = 0; i < m; i++) {
                System.out.print(nums1[i] + " ");
            }
            return;
        }

        // Copy nums1
        for (int i = 0; i < m; i++) {
            ans[i] = nums1[i];
        }

        // Copy nums2
        for (int i = 0; i < n; i++) {
            ans[m + i] = nums2[i];
        }

        Arrays.sort(ans);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}