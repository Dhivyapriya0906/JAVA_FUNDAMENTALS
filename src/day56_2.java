import java.util.Arrays;

public class day56_2 {
    public static void main(String[] args) {
        int[] nums={0,0};
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        for (int pass = 0; pass < arr.length; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {

                String a = arr[i];
                String b = arr[i + 1];

                if ((a + b).compareTo(b + a) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
        }
        String a=str.toString();
        if (a.charAt(0) == '0') {
            a = "0";
        }
        System.out.println(a);
    }
}
