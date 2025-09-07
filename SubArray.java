import java.util.List;
import java.util.*;

public class SubArray {
    static int sub(int[] nums) {
       int c=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                List<Integer> currList = new ArrayList<>();
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    currList.add(nums[k]);
                }
                if(currList.size()>=3){
                min=Math.min(min, currList.get(0));
                min=Math.min(min, currList.get(currList.size()-1));
                for(int l=1;l<currList.size()-1;l++){
                    max=Math.max(max,currList.get(l));
                }
                if(min>max){
                    c++;
                }
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,2,3,4};
        System.out.println(sub(arr));
    }
}
