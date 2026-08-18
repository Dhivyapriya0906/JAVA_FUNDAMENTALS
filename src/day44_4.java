import java.awt.image.renderable.RenderableImage;

public class day44_4 {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,0,0,1,1,1,0, 1,1,0,0,0,1,1,1,1 };
        int k=3;
        int count=0;
        int left=0;
        int zerocount=0;

        for(int right=0;right<nums.length;right++){
            int Len=0;
            if(nums[right]==0) {
                zerocount++;

            }
                while (zerocount > k) {
                    if(nums[left]==0){
                        zerocount--;
                    }
                  left++;
                }
            Len= right-left+1;
            count=Math.max(Len,count);
        }
        System.out.println(count);
    }
}
