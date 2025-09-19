import java.util.*;
public class Fibonaci_Dp {
    static int fibonaci(int n,int[] dp){
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibonaci(n-1, dp)+fibonaci(n-2, dp);
    }
    public static void main(String[] args) {
        
        int n=10;
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(fibonaci(n, dp));
    }
}
