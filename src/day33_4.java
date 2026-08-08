public class day33_4 {
    public static void main(String[] args) {
        String s="ABCDEFGH";
        int numRows=3;
        int count=0;
        StringBuilder[] rows=new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        boolean down=true;
        for(int i=0;i<s.length();i++){
               rows[count].append(s.charAt(i));
               if(count==0){
                   down =true;
               }
            if (count== numRows - 1)
                down = false;

            if (down)
                count++;
            else
                count--;

            }

        for (StringBuilder row : rows) {
            System.out.print(row);
        }
    }
}
