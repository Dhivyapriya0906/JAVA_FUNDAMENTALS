public class day29_3 {
    public static void main(String[] args) {
        String title = "capiTalIze tHe titLe";
        String[] ans=title.split(" ");
        StringBuilder a=new StringBuilder();

        for(int i=0;i< ans.length;i++) {
            if(ans[i].length()<=2){
                String a1=ans[i].toLowerCase();
                a.append(a1);

            }
            else{
                char c=ans[i].charAt(0);
                a.append(ans[i].substring(0,1).toUpperCase());
                a.append(ans[i].substring(1).toLowerCase());
            }
            if(i!=ans.length-1){
                a.append(" ");
            }

        }
        System.out.println(a);

    }
}
