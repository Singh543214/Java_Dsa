import java.util.*;
import java.lang.*;
class stack{
    Queue<Integer> q1;
    Queue<Integer> q2;
    stack(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    public void push(int data){
        q2.add(data);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> t=q1;
        q1=q2;
        q2=t;

    }
    public void pop(){
        if(q1.isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println(q1.peek());
        q1.remove();
    }
    public void peek(){
         if(q1.isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println(q1.peek());
    }

}

public class StackUsingQueue {
    public static void main(String[] args) {
        stack s= new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.peek();

        
    }
}
