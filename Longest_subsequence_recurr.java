import java.util.*;
import java.lang.*;
public class Longest_subsequence_recurr {
    static int LCS(String s1,String s2,int m,int n){
        if(m==0 || n==0) return 0;
        if(s1.charAt(n-1)==s2.charAt(m-1)) return 1+LCS(s1, s2, m-1, n-1);
        return Math.max(LCS(s1, s2, m-1, n),LCS(s1, s2, m, n-1));
    }
    public static void main(String[] args) {
        String s1="ABYZ";
        String s2="ACXYZ";
        int n=s1.length();
        int m=s2.length();
        System.out.println(LCS(s1, s2, m, n));
    }
}
