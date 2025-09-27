import java.util.*;
class Node{
    int data;
    Node next,prev;
    Node(int data){
        this.data=data;
        next=prev=null;
    }
}
public class DoublyLinkedList {
    static Node insert(int size,Node root,Node dummy,Scanner sc){
        if(size<=0){
            return dummy;
        }
        int data=sc.nextInt();
        Node newnNode=new Node(data);
        dummy.next=newnNode;
        newnNode.prev=dummy;
        if(root==null){
            root=newnNode;
        } 
       return insert(size-1, root, dummy.next, sc);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=sc.nextInt();
        Node dummy=new Node(0);
        Node tail=insert(n, null, dummy, sc);
        Node root=dummy.next;
        root.prev=null;
        Node front=root;
        Node tem=tail;
        System.out.println(front.data+" "+tail.data);
        while(tem!=null){
            System.out.print(tem.data+" ");
            tem=tem.prev;
        }
    }
}
