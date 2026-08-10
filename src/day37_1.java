public class day37_1 {
    public static void main(String[] args) {
        int num1=10,num2=10;
        int count=0;
        while(num2!=0 && num1!=0){
            if(num2>=num1){
                int temp=num2-num1;
                num2=num1;
                num1=temp;
            }
            else{
                int temp=num1-num2;
                num1=num2;
                num2=temp;
            }
            count++;
        }
        System.out.println(count);
    }
}
