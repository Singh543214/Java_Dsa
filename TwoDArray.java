import java.util.*;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[] arr1=new int[]{1,3,2};
        boolean find=false;
        for(int i=0;i<arr.length;i++){
            if(Arrays.equals(arr[i], arr1)){
                find=true;
                break;
            }
        }
        if(find) System.out.println("Yes");
        else System.out.println("No");
    }
}
