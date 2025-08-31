import java.util.*;
class InfixPostfix{
    boolean isOperator(char ch){
        return ch=='/' || ch=='*' || ch=='+' || ch=='-' || ch=='^';
    }
    static int operatorPrecedence(char ch){
        if(ch=='^') return 3;
        if(ch=='/' || ch=='*') return 2;
        if (ch=='+' || ch=='-') return 1;
        return -1;
    }
    String InfixToPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder res=new StringBuilder();
        int sz=s.length();
        for(int i=0;i<sz;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res.append(s.charAt(i));
            }
            else if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    res.append(st.pop());
                }
                st.pop();
            }
            else{
                while(!st.isEmpty() && operatorPrecedence(s.charAt(i))<= operatorPrecedence(st.peek())){
                    res.append(st.pop());
                }
                st.push(s.charAt(i));
            }
        }
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();

    }
    String Infixtoprefix(String s){
        StringBuilder x=new StringBuilder(s);
        x.reverse();
        s=x.toString();
        char[] sh=s.toCharArray();
        for(int i=0;i<sh.length;i++){
            if(sh[i]=='('){
                sh[i]=')';
            }
            else if(sh[i]==')'){
                sh[i]='(';
            }
        }
        String postfix=InfixToPostfix(new String(sh));
        return new StringBuilder(postfix).reverse().toString();

    }
}
public class InfixToPrefix {
   public static void main(String[] args) {
    InfixPostfix x= new InfixPostfix();
    String s="(a-b/c)*(a/k-l)";
    System.out.println(x.Infixtoprefix(s));
   } 
}
