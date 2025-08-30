import java.util.*;
class Node{
    int data;
    Node next,prev;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlist {
    public static void main(String[] args) {
        Node head =new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        head.next=second;
        second.next=third;
        Node x=head;
        while (x!=null) {
            System.out.println(x.data);
            x=x.next;
        }
    }
}
