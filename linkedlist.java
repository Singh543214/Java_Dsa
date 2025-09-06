import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlist {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size: ");
        int n=sc.nextInt();
        Node head=null;
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" data: ");
            int a=sc.nextInt();
            Node newnode=new Node(a);
            if(head==null){
                head=newnode;
            }
            else{
                Node ptr=head;
                while(ptr.next!=null){
                    ptr=ptr.next;
                }
                ptr.next=newnode;
            }

        }
        Node x=head;
        while (x!=null) {
            System.out.print(x.data+"->");
            x=x.next;
        }
        System.out.print("NULL");
    }
}
