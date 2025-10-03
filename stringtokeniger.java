import java.util.*;
public class stringtokeniger {
   public static void main(String[] args) {
    String s="12.012.23.45.67";
    int sum=0;
    StringTokenizer p=new StringTokenizer(s,".");
    while(p.hasMoreTokens()){
        sum+=Integer.parseInt(p.nextToken());
        System.out.println(sum);
    }
   } 
}
