public class day25 {
    public static void main(String[] args) {
        String s="I Love Coding";
        String[] s1=s.split(" ");
        for (int i= s1.length-1;i>=0;i--){
            System.out.print(s1[i]+" ");
        }
    }
}
