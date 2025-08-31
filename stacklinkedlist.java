import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Stack{
    Node head;
    Stack(){
        this.head=null;
    }
    boolean isEmpty(){
        return head==null;
    }
    void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        head=head.next;
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(head.data);
    }
    void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }

}
public class stacklinkedlist {
    public static void main(String[] args) {
        Stack s=new Stack();
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
