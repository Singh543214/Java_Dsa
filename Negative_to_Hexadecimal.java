import java.util.*;
public class Negative_to_Hexadecimal {
    static int To_decimal(int x){
        int sum=0;
        int pow=0;
        while(x!=0){
            sum=sum+((x%10)*(int)Math.pow(2, pow));
            pow++;
            x=x/10;
        }
        return sum;
    }
    static char format(int num){
      if(num>=10){
        return (char) (num-10 +'a');
      }
      return (char) (num+'0');
    }
    static String To_Hexa(int a){
        String s="";
        if(a==0) s=s+0;
        while(a!=0){
            int remainder=a%16;
            s=format(remainder)+s;
            a=a/16;
        }
        return s;
    }
    static String Negative(int num){
        int x=-num;
        String s="";
        while(x!=0){
            s=x%2+s;
            x=x/2;
        }
        int n=s.length();
        for(int i=1;i<=(32-n);i++){
            s=0+s;
        }
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='0'){
                sb.setCharAt(i,'1');
            }
            else{
                sb.setCharAt(i, '0');
            }
        }
        char ch='1';
        for(int i=sb.length()-1;i>=0;i--){
            if(ch=='1' && sb.charAt(i)=='1'){
                sb.setCharAt(i, '0');
                ch='1';
            }
            else{
                sb.setCharAt(i, '1');
                ch='0';
                break;
            }
        }
 
        s="";
        for(int i=0;i<8;i++){
            int binary=Integer.parseInt(sb.substring(4*i, 4*i+4));
            s=s+To_Hexa(To_decimal(binary));
        }
        return s;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Number: ");
       int num=sc.nextInt();
       if(num>=0) System.out.println(To_Hexa(num));
       else System.out.println(Negative(num));
    }
}