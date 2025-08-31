import java.util.*;
public class Pattern {
   public static void main(String[] args) {
    String s="ADITYA";
    int n=s.length();
    for(int i=0;i<n;i++){
        for(int j=0;j<2*n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print(s.charAt(k)+" ");
        }
        System.out.println();
    }
    for(int i=n-2;i>=0;i--){
        for(int j=0;j<2*n-i-1;j++){
            System.out.print(" ");
        }
        for(int k=0;k<=i;k++){
            System.out.print(s.charAt(k)+" ");
        }
        System.out.println();
    }
   } 
}
