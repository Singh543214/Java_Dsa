import java.lang.*;
public class LCS_Using_Dp_Tabulation {
    static int LCS(String s1,String s2,int m,int n,int[][] dp){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1="ABYZ";
        String s2="ACXYZ";
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        System.out.println(LCS(s1, s2, m, n, dp));
    }
}
