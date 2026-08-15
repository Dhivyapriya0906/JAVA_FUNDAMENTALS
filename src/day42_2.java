import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class day42_2 {
    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("Bangalore", "Chennai"));
        paths.add(Arrays.asList("Chennai", "Mumbai"));
        paths.add(Arrays.asList("Mumbai", "Delhi"));
        HashSet<String> set=new HashSet<>();
        for(int i=0;i< paths.size();i++){
            set.add(paths.get(i).get(0));
        }
        for(int i=0;i< paths.size();i++){
            if(!set.contains(paths.get(i).get(1))){
                System.out.println(paths.get(i).get(1));
            }

        }
    }
}
