public class day24_3 {
    public static void main(String[] args) {
        String moves = "UDLRR";
        int x=0,y=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                x++;
            }
            else if(moves.charAt(i)=='D'){
                x--;
            }
            else if(moves.charAt(i)=='L'){
                y++;
            }
            else{
                y--;
            }

        }
        if(x ==0 && y==0){
            System.out.println(true);
            return;
        }
        System.out.println(false);
    }
}
