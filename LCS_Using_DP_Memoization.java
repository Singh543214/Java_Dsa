import java.util.*;
import java.lang.*;
public class LCS_Using_DP_Memoization {
    static int LCS(String s1,String s2,int m,int n,int[][] dp){
        if(m==0 || n==0) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        if(s1.charAt(m-1)==s2.charAt(n-1)) return dp[m][n]=1+LCS(s1, s2, m-1, n-1, dp);
        return dp[m][n]=Math.max(LCS(s1, s2, m-1, n, dp),LCS(s1, s2, m, n-1, dp));
    }
    public static void main(String[] args) {
        String s1="ABYZ";
        String s2="ACXYZ";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i], -1);
        }
        System.out.println(LCS(s1, s2, m, n, dp));
    }
}
