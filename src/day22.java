import java.lang.*;
public class day22 {
    public static void main(String[] args) {
        String n=new String("hello world");
        int count=0;
        for (int i=0;i<n.length();i++){
            char ch = n.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' ||
                    ch == 'O' || ch == 'U') {
                count++;
            }

        }
        System.out.println("Count of vowel: "+count);
    }
}
