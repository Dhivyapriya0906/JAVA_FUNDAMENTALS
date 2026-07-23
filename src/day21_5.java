public class day21_5 {
    public static void main(String[] args) {
        int[] salary={3000,1000,2000};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i< salary.length;i++){
            if(max<salary[i]){
                max=salary[i];
            }
            if(min>salary[i]){
                min=salary[i];
            }
            sum+=salary[i];
        }
        double avg=(sum-max-min)/(salary.length-2);
        System.out.println(avg);
    }
}
