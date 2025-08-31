import java.util.*;
class stack{
    int size;
    int top;
    int[] stack;
    stack(int size){
        this.size=size;
        stack=new int[size];
        top=-1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top]=data;
    }
    public void pop(){
        if(top<0){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Element poped "+ stack[top]);
        top--;
    }
    public void peek(){
        if(top<0){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(stack[top]);
    }
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
public class Stackarray {
   public static void main(String[] args) {
    stack s=new stack(5);
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    s.push(50);
    s.print();
    s.pop();
    s.print();
    s.peek();
    s.pop();
    s.print();

   } 
}
