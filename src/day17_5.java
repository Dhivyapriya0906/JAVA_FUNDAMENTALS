public class day17_5 {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        int totalSum = 0;

        // Step 1: total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Step 2: iterate and check
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            }

            leftSum += nums[i];
        }

    }
}
