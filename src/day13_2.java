public class day13_2 {
    public static void main(String[] args) {
       String[][] items= {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
       String ruleKey = "type";
       String ruleValue = "phone";
       int index=0;
       if(ruleKey.equals("type")){
           index=0;
       }
       else if(ruleKey.equals("color")){
           index=1;

       }
       else{
           index=2;
       }
       int count=0;
       for(int i=0;i< items.length;i++){
           for(int j=index;j==index;j++){
               if(items[i][j].equals(ruleValue)){
                   count++;
               }
           }

       }
        System.out.println(count);
    }
}
