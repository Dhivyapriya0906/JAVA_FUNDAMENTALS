import java.util.*;
public class day72{
//    public static void main(String[] args) {
//    Scanner scan =new Scanner(System.in);
//    int n=scan.nextInt();
//
//    int count=0;
//
//    for (int i=1;i<=n;i++){
//        if(n<=1){
//            count=0;
//            break;
//        }
//       if(n%i==0){
//           count++;
//       }
//    }
//    if(count==2){
//        System.out.println("Prime");
//    }
//    else{
//        System.out.println("Not");
//    }
//    }
public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);
    int n=scan.nextInt();
    int c=0;
    if(n<=1){
        System.out.println("Not Prime");
        return;
    }
    for (int i=2;i<=(int)Math.sqrt(n);i++){
        if(n%i==0){
            c=1;
            break;
        }
    }
    if(c==1){
        System.out.println("Not Prime");
    }
    else{
        System.out.println("Prime");
    }
}
}
