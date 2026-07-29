import java.util.ArrayList;
import java.util.Arrays;

public class day25_1 {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        Arrays.sort(nums);

        ArrayList<Integer> arr = new ArrayList<>();

        int expected = 1;
        int i = 0;

        while (expected <= nums.length) {

            if (i < nums.length && nums[i] == expected) {
                // Skip all duplicates
                while (i < nums.length && nums[i] == expected) {
                    i++;
                }
            } else {
                arr.add(expected);
            }

            expected++;
        }

        System.out.println(arr);
    }
}