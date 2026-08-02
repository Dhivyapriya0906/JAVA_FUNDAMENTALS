public class day28_6 {
    public static void main(String[] args) {
        String sentences="eetcode exercises sound delightful";
        int len=sentences.split(" ").length;
        String[] sentences1=sentences.split(" ");
        if(sentences1.length==1){
            if(sentences1[0].charAt(0)==sentences1[0].charAt(sentences1[0].length()-1)){
                System.out.println("SIngle Word: "+true );
            }
            else{
                System.out.println("Single word: "+false);
            }
            return;
        }
        for(int i=0;i<sentences1.length-1;i++){
            if(sentences1[i+1].charAt(0)!=sentences1[i].charAt(sentences1[i].length()-1)){
                System.out.println("Multiple Words: "+false);
                return;
            }

        }
        if(sentences1[0].charAt(0)==sentences1[sentences1.length-1].charAt(sentences1[sentences1.length-1].length()-1)){
            System.out.println("Multiple fl words: "+true);
            return;
        }
        else{
            System.out.println("Multiple fl words: "+false);
        }

    }
}
