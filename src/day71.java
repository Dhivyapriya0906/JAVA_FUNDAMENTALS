import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=0;
        int[] arr={10};
        //int pos=arr[0];
        //int neg=arr[1];
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for (int i=0;i<arr.length;i++){
            if(arr[i]<0){
                neg.add(arr[i]);
            }
            else{
                pos.add(arr[i]);
            }
        }
        if(pos.size()>neg.size()){
            n=neg.size();
        }
        else{
            n= pos.size();
        }
        int k=0,k1=0;
        int i=0;
        while(i<n*2){
            if(i%2==0){
                ans.add(pos.get(k));
                k++;

            }
            else if(i%2!=0){
                ans.add(neg.get(k1));
                k1++;

            }
i++;
        }
        System.out.println(k+" "+k1);

        while(k<pos.size()){
            ans.add(pos.get(k));
            k++;

        }
        while(k1<neg.size()){
            ans.add(neg.get(k1));
            k1++;

        }

        //System.out.println(n);
        for(int e:ans){
            System.out.print(e+" ");
        }
    }
}
