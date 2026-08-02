public class day28_9 {
    public static void main(String[] args) {
        String[] details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        int count=0;
        for(int i=0;i<details.length;i++){
            int age=((int)details[i].charAt(11)-'0')*10 +details[i].charAt(12)-'0';
            if(age>60){
                count++;

            }
        }
        System.out.println(count);
    }
}
