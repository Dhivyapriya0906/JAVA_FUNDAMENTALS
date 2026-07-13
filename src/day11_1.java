public class day11_1 {
    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int count=0;

        for (int i=0;i<sentences.length;i++){
            String[] ans= sentences[i].trim().split("\\s+");
            System.out.println(ans.length);

        }


    }
}
