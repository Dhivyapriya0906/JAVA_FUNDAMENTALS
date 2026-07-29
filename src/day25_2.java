public class day25_2 {
    public static void main(String[] args) {
        int[]  timeSeries = {1,2};
        int duration =2;
        int total=0;
        for (int i=1;i<timeSeries.length;i++){
            int gap=timeSeries[i]-timeSeries[i-1];
            if(gap<duration){
                total+=gap;
            }
            else{
                total+=duration;
            }
        }
        total+=duration;
        System.out.println(total);
    }

}
