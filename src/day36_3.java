public class day36_3 {
    public static void main(String[] args) {
        String s = "?zs";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '?') {

                for (char ch = 'a'; ch <= 'z'; ch++) {

                    // Check left character
                    if (i > 0 && s.charAt(i - 1) == ch) {
                        continue;
                    }

                    // Check right character
                    if (i < s.length() - 1 && s.charAt(i + 1) == ch) {
                        continue;
                    }

                    ans.append(ch);
                    break;
                }

            } else {
                ans.append(s.charAt(i));
            }
        }
        System.out.println(ans);
    }
}
