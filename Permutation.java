import java.util.*;
public class Permutation {
    static void generatePermutation(String s,String prefix){
        if(s.length()==0){
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String remaining=s.substring(0, i)+s.substring(i+1);
            generatePermutation(remaining, prefix+ch);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        generatePermutation(s, "");
    }
}
