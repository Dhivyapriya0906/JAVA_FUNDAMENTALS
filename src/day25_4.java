public class day25_4 {
    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {


            if (nums[i] < 0) {
                //return 1;
                prod *= -1;
            } else if (prod == 0) {
                //return 0;
                System.out.println(0);
                return;
            }
        }
        System.out.println(prod);
    }
    }

