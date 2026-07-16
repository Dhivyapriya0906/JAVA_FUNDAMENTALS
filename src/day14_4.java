public class day14_4 {
    public static void main(String[] args) {
        int numBottles=15;
        int numExchange=4;
        int total=numBottles;
        int full_bottle=numBottles;
        int empty=numBottles;
        while(full_bottle!=0){
            full_bottle=empty/numExchange;
            int new_empty=empty%numExchange;
            total+=full_bottle;
            empty=full_bottle+new_empty;

        }
        System.out.println(total);
    }
}
//bottle=15       exchange=4

