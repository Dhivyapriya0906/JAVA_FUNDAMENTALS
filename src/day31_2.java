public class day31_2 {

    public static void main(String[] args) {
        String coordinates = "a1";
        if(coordinates.charAt(0)=='b' || coordinates.charAt(0)=='d' || coordinates.charAt(0)=='f'|| coordinates.charAt(0)=='h' ){
        if(coordinates.charAt(1)-'a' %2!=0){
            System.out.println(false);
            return;
        }
        System.out.println(true);
    }

    }

}
