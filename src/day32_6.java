public class day32_6 {
    public static void main(String[] args) {
        String s = "a1c1e1";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int num = ch - '0';
                char c = (char) (s.charAt(i - 1) + num);
                ans.append(c);
            } else {
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
}
