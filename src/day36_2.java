public class day36_2 {
    public static void main(String[] args) {
        String sentence="i love eating burger";
        String[] sp=sentence.split(" ");
        String searchWord = "burg";
        for (int i=0;i< sp.length;i++){
            if(sp[i].startsWith(searchWord)){
                System.out.println(i+1);
                return;
            }
        }
    }
}
