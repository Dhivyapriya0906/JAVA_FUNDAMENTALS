public class day34_1 {
    public static void main(String[] args) {
        char[] chars={'a','a','a','b','c','c'};
        int read=0;
        int write=0;
        int count=0;

        while(read< chars.length){
            char ch=chars[read];
            int in_count=0;
            count+=1;
            while( write< chars.length && ch==chars[write]){
                in_count+=1;
                write++;
            }
            if(in_count==0){
                count+=0;
            }

            else if(in_count<10){
                count+=1;
            }
            else {
                int c=0;
                while(in_count>0){

                    c++;
                    in_count/=10;
                }
                count+=c;
            }
            chars[read+1]=(char)(count+'0');
            read=write;
        }
        System.out.println(count);
    }
}
