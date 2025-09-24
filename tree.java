import java.util.*;
class box{
    int data;
    box left,right;
    box(int data){
        this.data=data;
        left=right=null;
    }
}
class treeOperation{
    box root;
    void insert(int data){
        box newnode=new box(data);
        if(root==null){
            root=newnode;
            return;
        }
        Queue<box> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            box temp=q.poll();
            if(temp.left==null){
                temp.left=newnode;
                break;
            }else{
                q.add(temp.left);
            }

            if(temp.right==null){
                temp.right=newnode;
                break;
            }else{
                q.add(temp.right);
            }
        }
    }

    void levelorder(box root){
        Queue<box> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            box temp=q.poll();
            System.out.print((temp.data)+" ");
             if(temp.left != null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
        }
        System.out.println();
    }

    int height(box root){
        if(root==null) return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }

    int countNodes(box root){
        if(root==null) return 0;
        return 1+ countNodes(root.left)+countNodes(root.right);
    }

    int countLeave(box root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 1;
        return countLeave(root.left)+countLeave(root.right);
    }

  
}
public class tree {
     static boolean isIdentical(box t1,box t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        return (t1.data==t2.data) && isIdentical(t1.left, t2.left) &&isIdentical(t1.right, t2.right);
    }

    static box mirror(box root){
        if(root==null) return null;
        box temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }
    public static void main(String[] args) {
        treeOperation t=new treeOperation();
        treeOperation t2=new treeOperation();
         treeOperation t3=new treeOperation();
        for(int i=1;i<10;i++){
            t.insert(i);
            t2.insert(i);
        }
       
        t.levelorder(t.root);
       t2.levelorder(t2.root);
        System.out.println("Height of t "+t.height(t.root));
        System.out.println("Number of node of t "+t.countNodes(t.root));
        System.out.println("Number of leaf node of t "+t.countLeave(t.root));
        System.out.println("Height of t2 "+t2.height(t2.root));
        System.out.println("Number of nodes of t2 "+t2.countNodes(t2.root));
        System.out.println("Number of leaf node of t2 "+t2.countLeave(t2.root));
        System.out.println(isIdentical(t.root, t2.root));
        t3.root=mirror(t.root);
        t3.levelorder(t3.root);
    }
}
