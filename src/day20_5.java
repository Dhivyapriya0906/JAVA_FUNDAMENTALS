public class day20_5 {
    public static void main(String[] args) {
        String current = "02:30", correct = "04:35";
        int count=0;
        int curtime=Integer.parseInt(current.substring(0,2))*60+Integer.parseInt(current.substring(3));
        int cortime=Integer.parseInt(correct.substring(0,2))*60+Integer.parseInt(correct.substring(3));
        int diff=cortime-curtime;
        int[] time={60,15,5,1};
        for(int t:time){
            count+=diff/t;
            diff%=t;
        }
        System.out.println(count);
    }
}
