import java.util.*;
import java.lang.*;
public class CircularMaxSum {
    static int maxsum(int[] arr){
        int res=arr[0];
        int n=arr.length;
        for(int i=0;i<n;i++){
            int currsum=0;
            for(int j=0;j<n;j++){
                int idx=(i+j)%n;
                currsum+=arr[idx];
                res=Math.max(res,currsum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxsum(arr));
    }
}
