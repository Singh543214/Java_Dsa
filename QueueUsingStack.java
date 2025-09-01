import java.util.*;
class QueueOperation{
    Stack<Integer> s1;
    Stack<Integer> s2;
    QueueOperation(){
        s1=new Stack<>();
        s2=new Stack<>();
    }
    public void enqueue(int data){
        if(s1.isEmpty()){
            s1.push(data);
            return;
        }
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }
    public void dequeue(){
        if(s1.isEmpty()){
        System.out.println("Queue is empty");
        return;
        }
        s1.pop();
    }
    public void top(){
         if(s1.isEmpty()){
        System.out.println("Queue is empty");
        return;
        }
       System.out.println(s1.peek());
    }

}
public class QueueUsingStack{
    public static void main(String[] args) {
        QueueOperation q = new QueueOperation();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(15);
        q.top();
        q.dequeue();
        q.top();
        q.dequeue();
        q.enqueue(20);
        q.top();
        
        
    }
}
