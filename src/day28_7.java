import java.util.Arrays;

public class day28_7 {
    public static void main(String[] args) {
        int[] skill={1,1,2,3};
                //      1 2 3 3 4 5
        long max=0;
        Arrays.sort(skill);
        int sum=skill[0]+skill[skill.length-1];
        System.out.println("sum: "+sum);
        int left=0,right=skill.length-1;
        while(left<right){
            if(sum!=skill[left]+skill[right]){
                System.out.println(-1);
                return;
            }
            max=max+(skill[left]*skill[right]);
            left++;
            right--;
        }
        System.out.println(max);
    }
}
