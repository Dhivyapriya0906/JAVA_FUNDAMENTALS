import java.util.ArrayList;

public class day43_3 {
    public static void main(String[] args) {
        int[] code = {5, 7, 1, 4};
        ArrayList<Integer> ans = new ArrayList<>();
        int k = -3;

        if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                int j = i + 1;
                int count = 0;

                while (count != k) {
                    j = j % code.length;
                    sum += code[j];
                    j++;
                    count++;
                }

                ans.add(sum);
            }
        }
        else if (k < 0) {
            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                int j = i - 1;
                int count = 0;

                while (count != Math.abs(k)) {

                    if (j < 0) {
                        j = code.length - 1;
                    }

                    sum += code[j];
                    j--;
                    count++;
                }

                ans.add(sum);
            }
        }

        System.out.println(ans);
    }
}