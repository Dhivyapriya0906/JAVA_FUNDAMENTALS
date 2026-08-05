import java.util.Arrays;

public class day31_4 {
    public static void main(String[] args) {
        int[] seats={3,1,5};
        int[] students={2,7,4};
        int sum=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++){
            sum+=Math.abs(seats[i]-students[i]);
        }
        System.out.println(sum);
    }
}
